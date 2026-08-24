class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        int start = 0, end = lower.length()-1;
        System.out.println(lower);
        while(start<end){
            if(!Character.isLetterOrDigit(lower.charAt(start))){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(lower.charAt(end))){
                end--;
                continue;
            }
            if(lower.charAt(start) != lower.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
