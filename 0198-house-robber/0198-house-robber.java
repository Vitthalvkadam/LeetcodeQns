class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for(int money : nums){
             int current = 0;
               if (prev1 > prev2 + money) {
                current = prev1;          // घर सोड
            } else {
                current = prev2 + money;  // घर लुट
            }

            prev2 = prev1;
            prev1 = current;
        }
    return prev1;
    }
}