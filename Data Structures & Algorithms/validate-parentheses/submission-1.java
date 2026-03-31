class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>(); 
        Map<Character, Character> charMap = Map.of(
            '}', '{',
            ']', '[',
            ')', '('
        );

        for(char ch: s.toCharArray()) {
            // if closing character
            if(charMap.containsKey(ch)) {
                // then expect stack to have opening char 
                if(stack.isEmpty() || charMap.get(ch) != stack.pop()) {
                    return false;
                } 
            } else {
                    stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
