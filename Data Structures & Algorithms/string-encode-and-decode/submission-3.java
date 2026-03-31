class Solution {

    public String encode(List<String> strs) {
        // Encode with: str.length()+specialSymbol+str
        StringBuilder sb = new StringBuilder(); 
        for(String str: strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        // Decoder will look at the word length and it will seperate by the special symbol
        List<String> result = new ArrayList<>();

        int i = 0;
        while(i < str.length()) {
            // example: 4#This2#Is1#A4#Test
            // j = 1
            int j = str.indexOf('#', i);

            // lengthOfWord = 4
            int lengthOfWord = Integer.parseInt(str.substring(i, j));

            // extract the word start from j+1 since j is '#'
            String word = str.substring(j + 1, j + 1 + lengthOfWord);
            result.add(word);
            // increment i
            i = j + 1 + lengthOfWord;
        }
        return result;
    }
}
