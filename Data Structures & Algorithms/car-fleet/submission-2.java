class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        int[][] pair = new int[len][2];
        for(int i = 0; i<len; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(a[0], b[0]));
        int fleets = 1;
        double time = (double)(target - pair[len-1][0]) / pair[len-1][1];
        for(int i = len-2; i>=0; i--){
            double currTime = Math.max((double)(target-pair[i][0]) / pair[i][1], time);
            if(currTime>time) fleets++; time = currTime;
        }
        return fleets;
    }
}
