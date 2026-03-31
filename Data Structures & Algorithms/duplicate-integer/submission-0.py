class Solution:
    #BruteForce solution
    def hasDuplicateBruteForce(self, nums: List[int]) -> bool:
        for i in range(len(nums)-1): 
            if(nums[i] == nums[i+1]): 
                return True
        return False


    #Optimized solution
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashSet = set()
        for n in nums: 
            if n in hashSet:
                return True
            hashSet.add(n)
        return False
         