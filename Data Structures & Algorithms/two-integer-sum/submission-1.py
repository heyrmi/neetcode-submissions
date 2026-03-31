class Solution:
    #BruteForce
    def twoSumBF(self, nums: List[int], target: int) -> List[int]:
        ans = []
        #iterate over array and compare
        for i in range(len(nums)-1): 
            for j in range(1, len(nums)): 
                if i == j : 
                    continue
                elif nums[i] + nums[j] == target: 
                    ans.append(i)
                    ans.append(j)
                    return ans
        return ans
        
    #Optimised use map
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = []
        # add to hashmap if not already there. 
        hashmap = {}
        for i in range(len(nums)): 
            difference = target - nums[i]
            if difference in hashmap:
                ans.append(hashmap.get(difference))
                ans.append(i)
            
            hashmap[nums[i]] = i
        return ans