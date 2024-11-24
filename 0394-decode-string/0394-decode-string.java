class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> numST= new Stack<>();
        Stack<String> sST = new Stack<>();
        int k = 0;

        for(int i=0; i<s.length(); i++)
        {
            String ch1 = "" + s.charAt(i);
            char ch2 = s.charAt(i);

            if(Character.isDigit(ch2))
            {
                k = (k * 10) + (ch2 - '0');
            }
            else if(!ch1.equals("]"))
            {
                if(ch1.equals("["))
                {
                    numST.push(k);
                    k=0;
                }
               sST.push(ch1);
            }
            else
            {
                String str = "";
                while(!sST.peek().equals("["))
                {
                   str = sST.pop() + str;
                }
                sST.pop();
                int num = numST.pop();
                sST.push(str.repeat(num));
            }
        }

        String s2 = "";
        while(!sST.isEmpty())
        {
            String s1 = sST.pop();
            s2 = s1 + s2;
        }

        return s2;
    }
}