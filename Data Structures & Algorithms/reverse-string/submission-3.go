func reverseString(s []byte) {
    low := 0; 
    high := len(s) - 1

    // keep swapping untill both pointers meet
    for low < high {
        s[low], s[high] = s[high], s[low]
        low++
        high--
    }
}
