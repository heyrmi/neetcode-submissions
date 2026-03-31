class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        Deque<Character> stack = new ArrayDeque<>(); 

        for(char ch: s.toCharArray()) {
            if(charMap.containsKey(ch)) {
                if(stack.isEmpty() || stack.pop() != charMap.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
