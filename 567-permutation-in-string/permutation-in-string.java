class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
    //     int m = s1.length();     //optimal approach(codestorywithMIC)
    //     int n = s2.length();

    //     if(m > n)  //base case
    //     {
    //         return false;
    //     }

    //    int[] freq1 = new int[26];  //both string frequency store
    //    int[] freq2 = new int[26];

    //    for(int i=0; i<m; i++)
    //    {
    //      freq1[s1.charAt(i) - 'a']++;  //s1 freq store
    //    }

    //    int i=0;   //sliding window approach
    //    int j=0;

    //    while(j < n)
    //    {
    //     freq2[s2.charAt(j) - 'a']++;   //s2 freq store

    //     if(j-i+1 > m)  //check s1 length window is less than current s2 length window
    //     {
    //         freq2[s2.charAt(i) - 'a']--;  //remove first char(i)
    //         i++;
    //     }

    //     if(Arrays.equals(freq1 , freq2))  //both freq are same , it is true 
    //     {
    //         return true;
    //     }
        
    //     j++;
    //    }

    //    return false;



    int n = s1.length();
    int m = s2.length();

    if(n > m)
    {
        return false;
    }

    char[] sorted1 = s1.toCharArray();
    Arrays.sort(sorted1);

    for(int i=0; i<=m-n; i++)
    {
        String temp = s2.substring(i,i+n);

        char[] sorted2 = temp.toCharArray();
        Arrays.sort(sorted2);

        if(Arrays.equals(sorted2 , sorted1))
        {
            return true;
        }

    }

    return false;

    }
}