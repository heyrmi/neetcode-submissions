class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int[] result = new int[n];

        // int zeroCount = 0, totalProduct = 1; 

        // for(int num: nums) {
        //     if(num == 0) {
        //         zeroCount++;
        //     } else {
        //         totalProduct *= num;
        //     }
        // } 

        // for(int i=0; i<n; i++) {
        //     if(zeroCount > 1) {
        //         result[i] = 0; // all products wil be 0 
        //     } else if (zeroCount == 1) {
        //         result[i] = (nums[i] == 0) ? totalProduct : 0;
        //     } else {
        //         result[i] = totalProduct / nums[i];
        //     }
        // }
        // return result;

        result[0] = 1; // since there is nothing left to the first index
        // Step 1. calculate the prefix
        for(int i=1; i<n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        // Step 2. calculate the suffix 
        int suffix = 1; // since there is nothing right to the last index 
        for(int i =n-1; i>=0; i--) {
            result[i] = suffix * result[i];
            suffix *= nums[i];
        }

        return result;

    }
}  
