class Solution {
    public int countPrimes(int n) {
        
        int primes[] = new int[n + 1];
        int countPrime = 0;

        for (int i = 2; i <= n; i++) 
        {
            primes[i] = 1;
        }

        for (int i = 2; i*i <= n; i++) 
        {
            if (primes[i] == 1) {
                for (int j = 2; i*j <= n; j++) 
                {
                    primes[i*j] = 0;
                }
            }
        }
        

        for (int i = 2; i < n; i++) 
        {
            if (primes[i] == 1)
                countPrime++;
        }

        return countPrime;
    }
}