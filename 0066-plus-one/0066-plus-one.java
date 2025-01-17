class Solution {
    public int[] plusOne(int[] digits) {
        
       
       for(int i=digits.length-1; i>=0; i--)
       {
        if(digits[i] < 9)    // if less than 9
        {
            digits[i]++;
            
            return digits;
        }

        digits[i] = 0;  //if equal to 9
       }


       digits = new int[digits.length + 1];   //if all element 9 so increment length + 1 , and first index 0 to put 1
       digits[0] = 1;
       return digits;
        
        
    }
}