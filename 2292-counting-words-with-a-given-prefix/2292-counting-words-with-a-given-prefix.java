class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int count = 0;
        for(String w : words)
        {
            if(w.length() >= pref.length() && w.substring(0,pref.length()).equals(pref))
            {
                count++;
            }
        }

        return count;
    }
}