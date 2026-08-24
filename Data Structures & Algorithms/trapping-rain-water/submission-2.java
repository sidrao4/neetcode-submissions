class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        int[] minlr = new int[len];
        int water = 0;
        int left = 0, right = 0;
        for(int i = 0; i<len-1; i++){
            maxLeft[i+1] = Math.max(height[i], maxLeft[i]);
        }
        for(int i = len-1; i>0; i--){
            maxRight[i-1] = Math.max(height[i], maxRight[i]);
        }
        for(int i = 0; i<len; i++){
            minlr[i] = Math.min(maxLeft[i], maxRight[i]);
            water+= Math.max(0, minlr[i]-height[i]);
        }
        return water;
    }
}
