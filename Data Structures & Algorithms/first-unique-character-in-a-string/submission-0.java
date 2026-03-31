class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(); 

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) {
                // first timer
                map.put(ch, i);
            } else {
                // repeater
                map.put(ch, -1);
            }
        }

        int min = Integer.MAX_VALUE;

        for(int val : map.values()) {
            if(val >= 0) {
                min = Math.min(min, val);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}