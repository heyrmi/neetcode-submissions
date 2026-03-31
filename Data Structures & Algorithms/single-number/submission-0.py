class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            is_unique = True
            for j in range(len(nums)):
                if i != j and nums[i] == nums[j]:
                    is_unique = False
                    break
            if is_unique:
                return nums[i]
