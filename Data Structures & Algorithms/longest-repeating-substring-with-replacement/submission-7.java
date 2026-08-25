class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> list = new HashMap<>();
        int result = 0;

        int l = 0;
        for(int r = 0; r<s.length(); r++){
            list.put(s.charAt(r), list.getOrDefault(s.charAt(r), 0)+1);

            while(((r-l+1) - Collections.max(list.values())) > k){
                list.put(s.charAt(l), list.get(s.charAt(l))-1);
                l++;
            }

            result = Math.max(result, r-l+1);



        }
        return result;
    }
}
