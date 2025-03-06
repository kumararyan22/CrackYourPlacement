class Solution {    
    public String firstPalindrome(String[] words) {                
        int n = words.length;   

        for (int i = 0; i < n; i++)
        {            
            char[] ch = words[i].toCharArray();  // Convert individual word to char array            
            if (palindromCheck(ch)) 
            {                
                return words[i];  //  Directly return the first palindrome found            
            }        
        }        
        return "";  //If no palindrome is found, return an empty string    
    }

    public boolean palindromCheck(char[] ch) {  

        int i = 0;
        int j = ch.length - 1;        
        while (i <= j) 
        {            
            if (ch[i] != ch[j])
            {                
                return false;            
            }            
            i++;            
            j--;        
        }        
        return true;    
    }
}
