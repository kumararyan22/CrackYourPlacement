
class Solution {
    public int maxScore(String s) {
      
       int n = s.length();
       int result = Integer.MIN_VALUE; // Initialize result with the minimum possible integer value
       int total_ones = 0; // Count of total '1's in the string

       // First loop to count total '1's in the string
       for(int i = 0; i < n; i++) {
           if(s.charAt(i) == '1') {
               total_ones++;
           }
       }

       int zeros = 0; // Count of '0's in the left part of the split
       int ones = 0; // Count of '1's in the left part of the split
       
       // Second loop to calculate scores at each possible split point
       for(int i = 0; i < n - 1; i++) {
           if(s.charAt(i) == '1') {
               ones++;
           } else {
               zeros++;
           }

           // Calculate '1's in the right part of the split
           int right_ones = total_ones - ones;
           
           // Update the maximum score found so far
           result = Math.max(result, zeros + right_ones);
       }

       return result; // Return the final maximum score
    }
}
