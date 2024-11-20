// class Solution {
//     public int strStr(String haystack, String needle) {

       
//        int res = haystack.indexOf(needle); 
//         return res;
//          //string inbuild method if char is exist so return the index num otherbise return -1.
       

        
        
//     }
// }

class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();

        // Edge case: If needle is empty, return 0
        if (n2 == 0) {
            return 0;
        }

        // Edge case: If needle is longer than haystack, return -1
        if (n2 > n1) {
            return -1;
        }

        // Iterate over haystack
        for (int i = 0; i <= n1 - n2; i++) {
            int j = 0;
            
            // Compare substring of haystack with needle
            while (j < n2 && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If all characters matched, return the starting index
            if (j == n2) {
                return i;
            }
        }

        // If needle is not found, return -1
        return -1;
    }
}
