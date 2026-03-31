class Solution:
    def isPalindrome(self, s: str) -> bool:
        alphanumeric_char_only = "".join(char for char in s if char.isalnum())
        lowercase_char = alphanumeric_char_only.lower()
        print(lowercase_char)

        start = 0
        end = len(lowercase_char) - 1

        while start <= end:
            if lowercase_char[start] != lowercase_char[end]:
                return False
            start += 1
            end -= 1

        return True