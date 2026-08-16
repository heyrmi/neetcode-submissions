class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char current = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // current string is too short
                if (i >= strs[j].length())
                    return first.substring(0, i);

                // character does not matches
                if (strs[j].charAt(i) != current)
                    return first.substring(0, i);
            }
        }
        return first;
    }
}