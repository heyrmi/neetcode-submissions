class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int[] result = new int[n];

        int zeroCount = 0, totalProduct = 1; 

        for(int num: nums) {
            if(num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        } 

        for(int i=0; i<n; i++) {
            if(zeroCount > 1) {
                result[i] = 0; // all products wil be 0 
            } else if (zeroCount == 1) {
                result[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                result[i] = totalProduct / nums[i];
            }
        }
        return result;
    }
}  
