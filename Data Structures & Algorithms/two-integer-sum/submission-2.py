class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = []
        hashMap = {}
        for i, n in enumerate(nums):
            difference = target - n
            if difference in hashMap:
                ans.append(hashMap.get(difference))
                ans.append(i)
            hashMap[n] = i
        return ans