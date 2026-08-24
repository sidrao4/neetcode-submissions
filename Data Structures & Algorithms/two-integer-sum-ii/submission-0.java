class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 1, end = numbers.length;
        while(numbers[start-1] + numbers[end-1] != target){
            if(numbers[start-1] + numbers[end-1] < target) start++;
            if(numbers[start-1] + numbers[end-1] > target) end--;
        }
        return new int[]{start, end};
    }
}
