class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> list = new HashMap<>();
        int result = 0;

        int maxf = 0;
        int l = 0;
        for(int r = 0; r<s.length(); r++){
            list.put(s.charAt(r), list.getOrDefault(s.charAt(r), 0)+1);
            if(list.get(s.charAt(r))>maxf){
                maxf = list.get(s.charAt(r));
            }

            while(((r-l+1) - maxf) > k){
                list.put(s.charAt(l), list.get(s.charAt(l))-1);
                l++;
            }

            result = Math.max(result, r-l+1);



        }
        return result;
    }
}
