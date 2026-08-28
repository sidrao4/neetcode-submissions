class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int temp;
        for(String c : tokens){
            try {
                int n = Integer.parseInt(c);
                stack.push(n);
            } catch (NumberFormatException e) {
                switch(c.charAt(0)){
                    case '+':
                        stack.push(stack.pop()+stack.pop());
                        break;
                    case '-':
                        temp = stack.pop();
                        stack.push(stack.pop()-temp);
                        break;
                    case '*':
                        stack.push(stack.pop()*stack.pop());
                        break;
                    case '/':
                        temp = stack.pop();
                        stack.push(stack.pop()/temp);
                        break;
                }
            }
        }
        return stack.pop();
        
    }
}
