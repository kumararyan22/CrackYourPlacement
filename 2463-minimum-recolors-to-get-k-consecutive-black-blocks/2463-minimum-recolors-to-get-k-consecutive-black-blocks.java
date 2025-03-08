class Solution {    
    public int minimumRecolors(String blocks, int k) {         

        int n = blocks.length();
        int i = 0;
        int j = 0;
        int minB = Integer.MAX_VALUE;
        int countW = 0;

        while (j < n) {            
            if (blocks.charAt(j) == 'W') {  
                countW++; // Count the number of 'W's in the window
            }

            // Maintain the window of size `k`
            if (j - i + 1 > k) 
            {  
                if (blocks.charAt(i) == 'W') 
                {  
                    countW--;  // Remove the effect of leftmost 'W'
                }
                i++; 
            }

            if (j - i + 1 == k) 
            {  
                minB = Math.min(minB, countW);  
            }

            j++;
        }

        return minB;
    }
}
