import java.util.Stack;
class ReversePolish {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();        
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a, b, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }        
        return stack.pop();
    }    
    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }    
    private static int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; 
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens1)); 
    }
}
