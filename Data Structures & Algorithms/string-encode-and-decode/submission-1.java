class Solution {

    // add length+encodeValue+string: 8#neetcode
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder(); 
        for(String str: strs) 
            encodedString.append(str.length()).append("#").append(str);  // Eg for neet: 4#neet
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i < str.length()) {
            int j=i;
            //traverse until you find '#'
            while(str.charAt(j) != '#') j++;

            //found length from '4#neet'
            int length = Integer.valueOf(str.substring(i, j));

            // j+1 because str[j] = #, so j+1+length 
            i = j+1 + length;
            list.add(str.substring(j+1, i));
        }
        return list;
    }
}
