class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Step 1: Sort so we can use two pointers
        Arrays.sort(people);

        int left = 0; // lightest person
        int right = people.length - 1; // heaviest person
        int boats = 0;

        // Step 2: Greedily pair lightest with heaviest
        while (left <= right) {
            // Check if lightest and heaviest can share a boat
            if (people[left] + people[right] <= limit) {
                left++; // lightest person is now paired, move on
            }
            // Heaviest person always boards this boat (alone or paired)
            right--;
            boats++;
        }
        return boats;
    }
}