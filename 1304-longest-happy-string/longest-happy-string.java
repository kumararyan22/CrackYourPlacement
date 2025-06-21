class Pair{
    int first;
    char second;

    public Pair(int first,char second)
    {
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
        PriorityQueue<Pair> maxpq = new PriorityQueue<>((p,q)-> q.first-p.first);
        if(a > 0)
        {
            maxpq.add(new Pair(a,'a'));
        }
        if(b > 0)
        {
            maxpq.add(new Pair(b,'b'));
        }
        if(c > 0)
        {
            maxpq.add(new Pair(c,'c'));
        }

        StringBuilder res = new StringBuilder();
        while(!maxpq.isEmpty())
        {
            Pair curr = maxpq.poll();
            int currFreq = curr.first;
            char currChar = curr.second;

            if(res.length() >= 2 && res.charAt(res.length()-1) == currChar && res.charAt(res.length()-2) == currChar)
            {
                if(maxpq.isEmpty())
                {
                    break;
                }

                Pair next = maxpq.poll();
                int nextFreq = next.first;
                char nextChar = next.second;

                res.append(nextChar);
                nextFreq--;

                if(nextFreq > 0)
                {
                    maxpq.add(new Pair(nextFreq,nextChar));
                }

                maxpq.add(curr);
            }
            else
            {
               res.append(currChar);
               currFreq--;

               if(currFreq > 0)
               {
                 maxpq.add(new Pair(currFreq,currChar));
               }
            }
        }

        return res.toString();
    }
}