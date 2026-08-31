class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = Arrays.stream(piles).max().getAsInt();
        int res = hi;
        int med = 0;
        int temp;
        while(lo<=hi){
            med = (hi+lo)/2;
            temp = 0;
            for(int c : piles){
                temp += Math.ceil(1.0*c/med);
            }
            if(temp>h){
                lo = med+1;
            }
            else{
                hi = med-1;
                res = med;
            }
        }
        return res;
    }
}
