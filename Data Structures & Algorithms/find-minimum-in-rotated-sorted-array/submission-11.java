class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        int res = nums[0];

        while(lo<=hi){
            if(nums[lo] < nums[hi]){
                res = Math.min(res, nums[lo]);
                break;
            }

            int k = (lo+hi)/2;
            res = Math.min(res, nums[k]);
            if(nums[k]>=nums[lo]){
                lo = k+1;
            } else{
                hi = k-1;
            }
        }
        return res;
    }
}
