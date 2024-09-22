class Solution {
    public int nthUglyNumber(int n) {
        
        if(n == 1)   //adge case handle
        {
            return 1;
        }

        ArrayList<Integer> list = new ArrayList<>();  //store the answer
        list.add(1);  //1 is always add bcz this num no prime factors

        int p1 = 0;  //index initialize
        int p2 = 0;
        int p3 = 0;

        while(list.size() < n)  //until size not equal n
        {
            int val1 = list.get(p1) * 2;  //index value get then multiply given factor
            int val2 = list.get(p2) * 3;
            int val3 = list.get(p3) * 5;

            int min = Math.min(val1 , Math.min(val2,val3));   //3 val on find the minimum find
            list.add(min);

            if(min == val1)  //if min val whose get is equal - equal val1 so increment index
            {
                p1++;
            }
            if(min == val2)
            {
                p2++;
            }
            if(min == val3)
            {
                p3++;
            }
        }

        return list.get(list.size()-1);  //last value get
    }
}