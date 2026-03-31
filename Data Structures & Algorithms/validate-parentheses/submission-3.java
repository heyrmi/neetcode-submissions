class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = Map.of(
            ')','(',
            ']','[',
            '}','{'
        );
        Deque<Character> stack = new ArrayDeque<>(); 

        for(char ch: s.toCharArray()) {
            if(charMap.containsValue(ch)) {
                stack.push(ch);
            } 
            if(charMap.containsKey(ch)) {
                if(stack.isEmpty() || stack.pop() != charMap.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
