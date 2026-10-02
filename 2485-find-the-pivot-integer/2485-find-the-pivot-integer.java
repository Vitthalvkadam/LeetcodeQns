class Solution {
    public int pivotInteger(int n) {

        int total = 0;

        // total sum
        for (int i = 1; i <= n; i++) {
            total += i;
        }

        // lhs sum
        int leftSum = 0;

        for (int x = 1; x <= n; x++) {

            leftSum += x;

            // rhs sum
            int rightSum = total - leftSum + x;

            if (leftSum == rightSum) {
                return x;
            }
        }

        return -1;
    }
}