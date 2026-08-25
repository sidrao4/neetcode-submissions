class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> list = new HashSet<>();
        int size = 0;
        int l = 0;
        for(int r = 0; r<s.length(); r++){
            while(list.contains(s.charAt(r))){
                list.remove(s.charAt(l));
                l++;
            }
            list.add(s.charAt(r));
            size = Math.max(size, r-l+1);

        }
        return size;
    }
}
