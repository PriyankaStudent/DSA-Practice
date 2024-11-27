import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> m = new HashMap<>();
        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');
        for (char c : s.toCharArray()) {
            if (m.containsValue(c)) {
                stack.push(c);
            } else if (m.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == m.get(c)) {
                    stack.pop(); 
                } else {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String priya[]){
        String s="(]";
        System.out.print(isValid(s));
    }
}
