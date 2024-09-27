class Solution {
    public String addBinary(String a, String b) {

        int n1 = a.length()-1;
        int n2 = b.length()-1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while(n1 >= 0 || n2 >= 0 || carry == 1)
        {
            int bitA = (n1 >= 0) ? a.charAt(n1) - '0': 0;
            int bitB = (n2 >= 0) ? b.charAt(n2) - '0': 0;

            int sum = bitA + bitB + carry;

            res.append(sum % 2);

            carry = sum / 2;

            n1--;
            n2--;

        }
        
        return res.reverse().toString();
        
    }
}