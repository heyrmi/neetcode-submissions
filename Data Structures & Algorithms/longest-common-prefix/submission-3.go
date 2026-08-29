func longestCommonPrefix(strs []string) string {
    if len(strs) == 0 {
		return ""
	}

	first := strs[0]

	for i := 0; i < len(first); i++ {
		// for every character in first string
		ch := first[i]
		
		// match is with other string 
		for j := 1; j < len(strs); j++ {
			if i >= len(strs[j]) || strs[j][i] != ch {
				return first[:i]
			}
		}
 	}

	return first
}
