class Solution {
    public int[] productExceptSelf(int[] nums) {
        // // Using the division approach
        // int product = 1, zeroCount = 0;
        // for(int num: nums) {
        //     if(num == 0) {
        //         zeroCount++;
        //     } else {
        //         product *= num;
        //     }
        // }

        // int[] result = new int[nums.length];

        // // More than 1 zero return an array with all 0s
        // if(zeroCount > 1) {
        //     return result;
        // }    

        // // If a single or no zero then we compute the result
        // for(int i = 0; i<nums.length; i++) {
        //     if(zeroCount > 0) {
        //         result[i] = (nums[i] == 0) ? product : 0;
        //     } else {
        //         result[i] = product / nums[i];
        //     }
        // }

        // return result; 

        int n = nums.length;
        int[] result = new int[n];

        // Left Product (forward pass)
        result[0] = 1; // nothing on left of first element (prefix)
        for(int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        // Right Product (backward pass)
        int right = 1; // (suffix) since nothing on the right of the last element
        for(int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}  
