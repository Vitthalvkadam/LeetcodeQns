class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for(int money : nums){
             int current = Math.max(
                prev1,           // हे घर सोड
                prev2 + money    // हे घर लुट
            );

            prev2 = prev1;
            prev1 = current;
        }
    return prev1;
    }
}