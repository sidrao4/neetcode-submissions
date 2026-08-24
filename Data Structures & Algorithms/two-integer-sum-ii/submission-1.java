class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 1, end = numbers.length;
        int sum = numbers[start-1] + numbers[end-1];
        while(sum != target){
            if(sum < target) start++;
            if(sum > target) end--;
            sum = numbers[start-1] + numbers[end-1];
            
        }
        return new int[]{start, end};
    }
}
