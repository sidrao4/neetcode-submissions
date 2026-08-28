class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int temp;
        for(String c : tokens){
            if(c.equals("+")) stack.push(stack.pop()+stack.pop());
            else if(c.equals("-")){
                temp = stack.pop();
                stack.push(stack.pop()-temp);
            }
            else if(c.equals("*")) stack.push(stack.pop()*stack.pop());
            else if (c.equals("/")){
                temp = stack.pop();
                stack.push(stack.pop()/temp);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
        
    }
}
