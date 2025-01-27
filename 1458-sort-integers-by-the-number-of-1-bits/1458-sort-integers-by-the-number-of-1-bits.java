
class Solution {

    public int countOneBits(int num)    //method define
    {
        int count = 0;
        while (num > 0) 
        {
            count += num & 1; // Increment count if the last bit is 1
            num >>= 1; // Right shift the number by 1
        }
        return count;
    }


    public int[] sortByBits(int[] arr) 
    {
        // Convert int[] to Integer[] for custom sorting
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Custom comparator to sort based on the count of 1 bits
        Arrays.sort(boxedArr, (a, b) -> 
        {
            int countA = countOneBits(a);
            int countB = countOneBits(b);

            if (countA == countB) 
            {
                return Integer.compare(a, b); // Sort by value if counts are the same
            }

            return Integer.compare(countA, countB); // Otherwise, sort by count
        });

        // Convert Integer[] back to int[]
        return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
    }

}
