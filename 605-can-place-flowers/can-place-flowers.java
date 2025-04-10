
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        if(n==0)
        {
            return true;
        }

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Mark the plot as planted with a flower
                n--; // Decrement the number of flowers to be placed
                
            }
            
                if (n == 0) // Check if all flowers have been placed
                    return true;
        }

        return false; // If not all flowers can be placed, return false
    }
}
