class Solution {
    public void reverseString(char[] s) {
        // This problem can be best solved with two pointers. 
        // First pointers named 'low' will start from index 0 
        // Second pointer named 'high' will start from last index n-1 

        // if s is empty: 
        if (s == null || s.length == 0) {
            return;
        }

        int n = s.length; 

        // left pointer 
        int low = 0;
        int high = n-1;

        while (low < high) {
            // swap the chars
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            // move the pointers
            low++; 
            high--;
        }
    }
}