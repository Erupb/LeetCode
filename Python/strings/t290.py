class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words: list = s.split(" ")
        pattern_to_word: dict = {}
        if len(pattern) != len(words):
            return False
        for index, word in enumerate(words):
            if pattern[index] in pattern_to_word and pattern_to_word[pattern[index]] != word:
                return False
            if word in pattern_to_word.values():
                if pattern[index] in pattern_to_word and pattern_to_word[pattern[index]] == word:
                    continue
                else:
                    return False
            else:
                pattern_to_word[pattern[index]] = word
        
        return True
