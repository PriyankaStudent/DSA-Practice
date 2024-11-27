import java.util.Stack;

public class Parentheses {
    static void balanced(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                char b=st.peek();
                if(b=='('){
                    st.pop();
                }
                else{
                    System.out.print("Not Balanced");
                }
            }
            System.out.print("Balanced");
        }
    }
    public static void main(String ar[]){
        String s="((()))()()";
        balanced(s);
    }
}

