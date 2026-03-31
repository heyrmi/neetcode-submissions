class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        // if we use hashmap (it will take space o(n))
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            if(!map.containsKey(c)) {
                return false;
            }
            // if you find decrement the counter for each veriable
            map.put(c, map.get(c) -1);

            // if a char does not exist in map remove it
            if(map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
    }
}
