class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, zeroCount = 0;
        // track and multiply
        for(int num: nums) {
            if(num == 0) 
                zeroCount++;
            else 
                prod *= num;
            
        }

        int[] result = new int[nums.length];

        if(zeroCount > 1) 
            return result;
        

        for(int i=0; i<nums.length; i++) {
            if(zeroCount > 0) 
                result[i] = (nums[i] == 0) ? prod : 0;
            else 
                result[i] = prod / nums[i];
        }

        return result;
    }
}  
