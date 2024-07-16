class Solution {
    public int findDuplicate(int[] nums) {
        int len= nums.length;
        int low=1,high=len-1,ans=0;
        while(low <= high){
            int mid = low+(high-low)/2;
            int cnt = 0;
            for(int i = 0; i<len; i++){
                if(nums[i] <= mid){
                    cnt++;
                }
            }
            if(cnt <= mid){
                low = mid+1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}
