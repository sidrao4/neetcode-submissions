class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> list = new ArrayDeque<>();
        int[] res = new int[nums.length-k+1];
        list.push(nums[0]);
        for(int i = 1; i<k; i++){
            while(list.size()>0 && list.peekLast()<nums[i]) list.removeLast();
            list.offer(nums[i]);
        }
        res[0] = list.peek();
        for(int r = k; r<nums.length; r++){
            if(list.peek() == nums[r-k]) list.pop();
            while(list.size()>0 && list.peekLast()<nums[r]) list.removeLast();
            list.offer(nums[r]);
            res[r-k+1] = list.peek();
        }
        return res;
    }
}
