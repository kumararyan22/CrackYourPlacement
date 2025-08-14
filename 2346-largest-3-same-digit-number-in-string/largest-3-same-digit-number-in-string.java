class Solution {
    public String largestGoodInteger(String num) {
        
      
       if(num == null || num.length() < 3)
       {
        return "";
       }

       String s = "";
    
       for(int i=0; i<=num.length()-3; i++)
       {
        char first = num.charAt(i);
        char second= num.charAt(i+1);
        char third = num.charAt(i+2);

       if(first == second && second == third)
       {
        String current = "" + first + second + third;
        
        if(current.compareTo(s) > 0)
        {
            s = current;
        }
       }
       }

       return s;
    }
}