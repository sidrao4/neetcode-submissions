class Solution {
    public boolean isValidSudoku(char[][] board) {
        int current, subbox;
        Map<Integer, ArrayList<Integer>> list = new HashMap<>();;
        for(int i = 0; i<9; i++){
            for(int k = 0; k<9; k++){
                if(board[i][k] != '.'){
                    current = (int)board[i][k] - '0';
                    subbox = k/3 + i/3*3;
                    ArrayList<Integer> temp = list.getOrDefault(current, new ArrayList<>());
                    if(!temp.isEmpty()){
                        if(temp.contains(k) || temp.contains(i+10) || temp.contains(subbox+20)) return false;
                    }
                    temp.add(k);
                    temp.add(i+10);
                    temp.add(subbox+20);
                    list.put(current, temp);
                }
            }
        }
        System.out.println(list);

        return true;
    }
}
