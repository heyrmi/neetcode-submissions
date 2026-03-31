class Solution:
    def isPalindrome(self, s: str) -> bool:
        lowercase_char  = "".join(char for char in s if char.isalnum()).lower()
        
        print(lowercase_char)

        start = 0
        end = len(lowercase_char) - 1

        while start <= end:
            if lowercase_char[start] != lowercase_char[end]:
                return False
            start += 1
            end -= 1

        return True