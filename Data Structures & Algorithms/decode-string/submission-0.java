class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>(); 
        Deque<StringBuilder> stringStack = new ArrayDeque<>(); 

        StringBuilder current = new StringBuilder(); 
        int k = 0;

        for(char ch: s.toCharArray()) {
            if(Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // handle multi digit
            } else if(ch == '[') {
                countStack.push(k);
                stringStack.push(current); // save context
                current = new StringBuilder(); // start fresh
                k = 0;
            } else if(ch==']') {
                StringBuilder decoded = stringStack.pop(); 
                int repeatCount = countStack.pop(); 
                for(int i = 0; i < repeatCount; i++) {
                    decoded.append(current); // repeat and attach
                }
                current = decoded;
            } else {
                current.append(ch); // regular letter
            }
        }
        return current.toString(); 
    }
}