class Solution {

    public boolean doesAliceWin(String s) {
    
        int n=s.length();
        int count=0;

        for(char ch : s.toCharArray())
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }

        if(count == 0)
        {
            return false;
        }

       if(count % 2 != 0)
       {
        return true;
       }
      
      int idx=-1;
      for(int i=0; i<n; i++)
      {
        if(count > 1)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
              {
                count--;
              }
        }
        else
        {
            idx=i;
            break;
        }
      }

      if(s.charAt(idx)!='a'||s.charAt(idx)!='e'||s.charAt(idx)!='i'||s.charAt(idx)!='o'||s.charAt(idx)!='u')
      {
        return true;
      }
      return false;
    }
}