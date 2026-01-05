class Solution:
    def minFlipsMonoIncr(self, s: str) -> int:
        flips_count = 0
        ones_count = 0

        for i in s:
            if i == "1":
                ones_count += 1
            else:
                flips_count = min(1 + flips_count, ones_count)
        
        return flips_count
