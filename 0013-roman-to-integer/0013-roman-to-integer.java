class Solution {
    public int romanToInt(String s) {

         int sum = 0;
         int index = 0;

         while(index < s.length()-1)
         {
            if(num(s.charAt(index)) < num(s.charAt(index+1)))
            {
                sum -= num(s.charAt(index));
            }
            else
            {
                sum += num(s.charAt(index));
            }
            index++;  //every iteration check - index update
         }

         sum += num(s.charAt(index));  //index == s.length()  , last index sum
         return sum;
    }

    public static int num(char c)
    {
        if(c == 'I')
        {
            return 1;
        }
        else if(c == 'V')
        {
            return 5;
        }
        else if(c == 'X')
        {
            return 10;
        }
        else if(c == 'L')
        {
            return 50;
        }
        else if(c == 'C')
        {
            return 100;
        }
        else if(c == 'D')
        {
            return 500;
        }
        else 
        {
            return 1000;
        }
    }
}