class Solution {
    public int maxArea(int[] heights) {
        int area, maxArea = 0;
        int l = 0, r = heights.length-1;
        while(l<r){
            area = (r-l)*Math.min(heights[r], heights[l]);
            maxArea = Math.max(maxArea, area);
            if(heights[l]<heights[r]) l++;
            else r--;
        }
        return maxArea;
    }
}
