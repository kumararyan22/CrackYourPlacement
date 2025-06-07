class Pair {
     char c;
     int i;
  public Pair(char c, int i) 
    {
        this.c = c;
        this.i = i;
    }
}

class Solution {
    public String clearStars(String s) 
    {
        char[] str = s.toCharArray();

        // Comparator: prefer lex smallest char, and if equal, prefer rightmost (larger index)
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.c == b.c) {
                return Integer.compare(b.i, a.i); // Rightmost smallest is removed
            }
            return Character.compare(a.c, b.c); // Lex smallest
        });

        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c != '*') {
                pq.add(new Pair(c, i));
            } else {
                if (!pq.isEmpty()) {
                    Pair p = pq.poll();         // remove the best candidate
                    str[p.i] = '*';          // mark for deletion
                    str[i] = '*';            // also mark the '*'
                }
            }
        }

        // Build result by skipping all '*'s
        StringBuilder sb = new StringBuilder();
        for (char ch : str) {
            if (ch != '*') {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
