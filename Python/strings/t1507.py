import re

class Solution:
    def reformatDate(self, date: str) -> str:
        months: list = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]

        day, month, year = date.split(" ")
        day = re.findall(r'\d+', day)[0]
        if len(day) == 1:
            day = '0' + day
        month = months.index(month) + 1
        if month < 10:
            month = '0' + str(month)

        return f'{year}-{month}-{day}'


class OptimizedSolution:
    def reformatDate(self, date: str) -> str:
        months: list = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]

        day, month, year = date.split(" ")
        day = day[:-2].zfill(2)
        month = str(months.index(month) + 1).zfill(2)

        return f'{year}-{month}-{day}'
