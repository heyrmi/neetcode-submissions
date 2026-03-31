class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = Map.of(
            ')','(',
            '}','{',
            ']','['
        );

        Deque<Character> stack  = new ArrayDeque<>();

        for(Character ch: s.toCharArray()) {
            // process all the closing parenthesis
            if(charMap.containsKey(ch)) {
                if(stack.isEmpty() || stack.pop() != charMap.get(ch)) {
                    return false;
                }
            }
            // then its a valid opening parenthesis 
            else {
                stack.push(ch);
            } 
        }
        return stack.isEmpty();
    }
}
