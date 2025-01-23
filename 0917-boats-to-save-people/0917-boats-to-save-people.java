import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int low = 0; // Pointer to the lightest person
        int high = people.length - 1; // Pointer to the heaviest person
        int count = 0; // Number of boats required

        while (low <= high) 
        {
            if (people[low] + people[high] <= limit) //less than or equal
            {
                low++; // Move the low pointer
            }

            high--; // Move the high pointer (otherwise)
            count++; // Increment the boat count
        }

        return count; 
    }
}
