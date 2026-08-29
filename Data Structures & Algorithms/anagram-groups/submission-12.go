func groupAnagrams(strs []string) [][]string {
	groups := make(map[[26]int][]string) // frequency signature -> list of anagrams

	for _, word := range strs {
		var count [26]int // counts for 'a' to 'z'

		for _, ch := range word {
			count[ch-'a']++ // build frequency signature
		}

		groups[count] = append(groups[count], word) // group words with same signature
	}

	result := make([][]string, 0, len(groups)) // collect all groups

	for _, group := range groups {
		result = append(result, group)
	}

	return result
}