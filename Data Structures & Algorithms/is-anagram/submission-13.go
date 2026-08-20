func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	
	count := make(map[byte]int)

	for i := 0; i < len(s); i++ {
		count[s[i]]++
		count[t[i]]--
	} 

	for _, freq := range count {
		if freq != 0 {
			return false
		}
	}

	return true
}
