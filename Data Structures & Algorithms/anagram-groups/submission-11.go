func groupAnagrams(strs []string) [][]string {
	groups := make(map[[26]int][]string) 

	for _, word := range strs {
		var count [26]int

		for _, ch := range word {
			count[ch - 'a']++
		}
		
		// Add to the map
		groups[count] = append(groups[count], word)
	}

	result := make([][]string, 0, len(groups))

	for _, group := range groups {
		result = append(result, group)
	}

	return result
}
