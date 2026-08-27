class Solution {
    public String minWindow(String s, String t) {
        if(t.length()==0) return "";
        Map<Character, Integer> countT = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            countT.put(t.charAt(i), 1+ countT.getOrDefault(t.charAt(i),0));
        }
        Map<Character, Integer> window = new HashMap<>();
        int have = 0;
        int need = countT.size();
        int[] res = new int[]{-1, -1};
        int l = 0;
        for(int r = 0; r<s.length(); r++){
            window.put(s.charAt(r), 1+window.getOrDefault(s.charAt(r),0));
            if(countT.containsKey(s.charAt(r)) && window.get(s.charAt(r)).equals(countT.get(s.charAt(r)))){
                have++;
            }
            while(have == need){
                if(res[0] == -1 || r-l+1 < res[1]-res[0]+1) res = new int[]{l, r};
                window.put(s.charAt(l), window.get(s.charAt(l))-1);
                if(countT.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < (int)countT.get(s.charAt(l))) have--;
                l++;
            }
        }
        if(res[0]==-1) return "";
        return s.substring(res[0], res[1]+1);
    }
}


