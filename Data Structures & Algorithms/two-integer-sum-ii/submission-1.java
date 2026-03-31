class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1; 

        while(left < right) {
            int summation = numbers[left] + numbers[right];
            if(summation == target) {
                return new int[] {left + 1, right + 1};
            } else if(summation < target) {
                left++;
            } else if(summation > target) {
                right--;
            } 
        }
        return new int[]{};
    }
}
