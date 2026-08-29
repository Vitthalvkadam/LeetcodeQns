class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        // Keep the maximum position we can reach.
        // If we cannot reach the current position, return false; otherwise, reach the end and return true.
        
        for(int i = 0; i<nums.length; i++){
            if(i > maxReach){
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if( maxReach >= nums.length-1){
                return true;
            }


        }
        return true;
    }
}