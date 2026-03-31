class Solution {
    public boolean isPalindrome(String s) {
        // String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // int left = 0; 
        // int right = cleanStr.length() - 1; 

        // while(left < right) {
        //     if(cleanStr.charAt(left) != cleanStr.charAt(right)) 
        //         return false;
        //     left++;
        //     right--;
        // }
        // return true;

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
