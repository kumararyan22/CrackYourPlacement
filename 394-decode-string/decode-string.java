class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> numStack = new Stack<>();
        Stack<String> sStack = new Stack<>();
        int k=0;

        for(int i=0; i<s.length(); i++)
        {
            String ch1 = "" + s.charAt(i);
            char ch2 = s.charAt(i);
            
            if(Character.isDigit(ch2))
            {
                k = k * 10 + (ch2 - '0');
            }
            else if(!ch1.equals("]"))
            {
                if(ch1.equals("["))
                {
                    numStack.push(k);
                    k=0;
                }

                sStack.push(ch1);
            }
            else
            {
                String str = "";
                while(!sStack.peek().equals("["))
                {
                    str = sStack.pop() + str;
                }
                sStack.pop();

                int num = numStack.pop();
                sStack.push(str.repeat(num));
            }
        }
        
            String ans = "";
            while(!sStack.isEmpty())
            {
                String s1 = sStack.pop();
                ans = s1 + ans;

            }

        return ans;
    }
}