class PrimeCalculator {
    private static boolean isPrime(int n) {
        int factors = 1;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                factors++;
            }
        }

        return factors == 2;
    }
    int nth(int nth) {
        int primeCount = 0;
        int i = 2;

        while(primeCount < nth) {
            if(isPrime(i)) {
                primeCount++;
            }

            i++;
            System.out.println(i);
        }
        

        return i;
    }

}
