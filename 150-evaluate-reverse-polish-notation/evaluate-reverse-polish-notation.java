class Solution {
    public int evalRPN(String[] tokens) {
        // i guess this is a postfix expression given i need to evaluate it only
        Deque<Integer> s= new ArrayDeque<>();
        for(String token: tokens){

            if(token.equals("+") ||token.equals("-") || token.equals("*") || token.equals("/")){
                int val2= s.pop();
                int val1= s.pop();
                 switch(token){
                    case "+": s.push(val1 + val2); break;
                    case "-": s.push(val1 - val2); break;
                    case "/": s.push(val1 /val2); break;
                    case "*":s.push(val1 * val2); break;
                }
            }

            else{
                
                s.push(Integer.parseInt(token));
               
            }
        }
        //we are pushing a int value only so correct return type;
       return s.pop();


    }
}