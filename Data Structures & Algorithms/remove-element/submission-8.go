func removeElement(nums []int, val int) int {
    write := 0

	for _, num := range nums {
		if num != val {
			nums[write] = num
			write++
		}
	}

	return write
}
