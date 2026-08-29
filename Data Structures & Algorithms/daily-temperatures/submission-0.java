class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i]>stack.peek()[0]){
                int[] entry = stack.pop();
                res[entry[1]] = i-entry[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}
