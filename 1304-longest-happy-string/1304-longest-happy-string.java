    // Nested Pair class to store frequency and character
class Pair {
        int first;
        char second;

        public Pair(int first, char second) {
            this.first = first;
            this.second = second;
        }
    }

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // Create a max heap based on character frequency
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((p1, p2) -> p2.first - p1.first);

        // Add characters to the max heap if they have a positive count
        if (a > 0) {
            maxHeap.add(new Pair(a, 'a'));
        }
        if (b > 0) {
            maxHeap.add(new Pair(b, 'b'));
        }
        if (c > 0) {
            maxHeap.add(new Pair(c, 'c'));
        }

        StringBuilder res = new StringBuilder();

        // While there are characters left in the heap
        while (!maxHeap.isEmpty()) {
            Pair curr = maxHeap.poll();
            int currCount = curr.first;
            char currChar = curr.second;

            // If the last two characters in the result are the same as the current character
            if (res.length() >= 2 && res.charAt(res.length() - 1) == currChar && res.charAt(res.length() - 2) == currChar) {
                // If there's nothing else to use, break out of the loop
                if (maxHeap.isEmpty())
                {
                    break;
                }

                // Use the next most frequent character instead
                Pair next = maxHeap.poll();
                res.append(next.second);
                next.first--;

                // Put the next character back if it still has more occurrences
                if (next.first > 0)
                {
                    maxHeap.add(next);
                }

                // Put the current character back to try again later
                maxHeap.add(curr);
            } 
            
            else {
                // Append the current character
                res.append(currChar);
                currCount--;

                // Put it back in the heap if there are more of this character
                if (currCount > 0)
                {
                    maxHeap.add(new Pair(currCount, currChar));
                }
            }
        }

        return res.toString();
    }
}
