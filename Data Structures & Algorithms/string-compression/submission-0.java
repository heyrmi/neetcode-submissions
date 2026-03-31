class Solution {
    public int compress(char[] chars) {
        int read = 0; 
        int write = 0; 

        while(read < chars.length) {
            char currentChar = chars[read];
            int count = 0; 
            
            // count consecutive chars
            while(read < chars.length && chars[read] == currentChar ) {
                read++; 
                count++; 
            }

            // write the character
            chars[write++] = currentChar;

            if(count > 1) {
                String countStr = String.valueOf(count);
                for(char ch: countStr.toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }
        return write; 
    }
}