class Solution {
    public String longestCommonPrefix(String[] strs) {
        // for empty array
        if( strs == null || strs.length == 0) {
            return "";        
        }

        String firstString = strs[0];
        
        // loop over chars from the first string. 
        for(int i = 0; i < firstString.length(); i++) {
            char curChar = firstString.charAt(i);

            // compare this character with other strings in the array. 
            for(int j = 1; j < strs.length; j++) {
                // if string is shorter or char mismatch
                if(i >= strs[j].length() || strs[j].charAt(i) != curChar) {
                   // prefix found till index i
                    return strs[0].substring(0, i);
                }
            }
        }
        // else return the full match
        return strs[0];
    }
}