class Solution {
    public String intToRoman(int num) {
        
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String res = "";

        for(int i=0; i<symbols.length; i++)  
        {
            while(num >= values[i])  //num check
            {
                res += symbols[i];  //current symbol add
                num -= values[i];  //present value out
            }
        }

        return res;
    }
}