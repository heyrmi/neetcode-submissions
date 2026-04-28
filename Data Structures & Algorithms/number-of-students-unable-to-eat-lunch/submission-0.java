class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // count the category
        int[] count = new int[2];
        for(int student: students) {
            count[student]++;
        }

        for(int sandwich: sandwiches) {
            if(count[sandwich] == 0) {
                // no one wants this, return total remaining
                return count[0] + count[1];
            }
            count[sandwich]--;
        }
        return 0;
    }
}