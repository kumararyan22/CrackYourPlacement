class Solution {
    public double myPow(double x, int n) {

        return solve(x , (long)n);   //convert the long
        
    }

    public static double solve(double x , long n)  //function define
    {
        if(n == 0)  //base case 
        {
            return 1;
        }

        if(n < 0)  //less than 0 , it means negative num n
        {
            return solve(1/x , -n);  //-n , bcz -n already present so( - * - = +)
        }

        if(n % 2 == 0)  //if power is even
        {
            return solve(x*x , n/2); // (8 = (2*2) , 8/2)
        }
        else  //if power is odd
        {
            return x * solve(x*x , (n-1)/2);   //n-1 (9-1 = 8)
        }
    }
}