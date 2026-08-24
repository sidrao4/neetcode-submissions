class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for(int curr : nums){
            result.add(curr);
        }
        int longest = 0, length = 0;
        for(int n : nums){
            if(!result.contains(n-1)){
                length = 0;
                while(result.contains(n+length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;

    }
}
