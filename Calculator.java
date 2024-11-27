import java.util.Stack;
class Calculator {
    public int calculate(String s) {
        int result = 0; 
        int sign = 1;   
        int number = 0; 
        Stack<Integer> stack = new Stack<>();  
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } 
            else if (ch == '+') {
                result += sign * number;
                number = 0;  
                sign = 1;    
            } 
            else if (ch == '-') {
                result += sign * number;
                number = 0; 
                sign = -1;  
            } 
            else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;  
                sign = 1;    
            } 
            else if (ch == ')') {
                result += sign * number;
                number = 0;  
                result *= stack.pop();  
                result += stack.pop();  
            }
        }
        result += sign * number;
        return result;
    }
    public static void main(String[] args) {
        Calculator solution = new Calculator();
        System.out.println(solution.calculate("(1+(4+5+2)-3)+(6+8)")); 
    }
}
