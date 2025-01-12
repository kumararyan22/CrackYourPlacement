class Solution {
    public int trap(int[] height) {
      
      int n = height.length;
      if(n == 0 || n < 3)   //base case , if less than 3 height so water not store any place
      {
        return 0;
      }

      int[] maxL = new int[n];   //for lest side - find greatest height
      maxL[0] = height[0];
      for(int i=1; i<n; i++)
      {
        maxL[i] = Math.max(maxL[i-1] , height[i]);  
      }
      

      int[] maxR = new int[n];    //for right side - find greatest height
      maxR[n-1] = height[n-1];    //first height store
      for(int i=n-2; i>=0; i--)
      {
        maxR[i] = Math.max(maxR[i+1] , height[i]);  //bcz i+1 , last height reach
      }

      int[] water = new int[n];
      for(int i=0; i<n; i++)
      {
        water[i] = Math.min(maxL[i] , maxR[i]) - height[i];
      }
        
      int sum = 0;
      for(int i=0; i<n; i++)
      {
        sum = sum + water[i];
      }

      return sum;
    }
}
