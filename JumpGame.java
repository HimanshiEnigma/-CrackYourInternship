class Solution {
    public boolean canJump(int[] nums) {
        int currentdest = nums.length-1;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]+i >= currentdest){
                currentdest = i;
            }
        }
        if(currentdest ==0){
            return true;
        }
        return false;
    }
}
