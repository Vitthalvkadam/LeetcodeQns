class Solution {
    public int[] closestPrimes(int left, int right) {

        int first = -1;
        int second = -1;

        int previous = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {

            if (isPrime(i)) {

                if (previous != -1) {

                    int diff = i - previous;

                    if (diff < minDiff) {
                        minDiff = diff;
                        first = previous;
                        second = i;
                    }
                }

                previous = i;
            }
        }

        return new int[]{first, second};
    }

    private boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}