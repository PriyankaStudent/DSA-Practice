import java.util.*;
public class StachE {
    public static void main(String ar[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(36);
        s.push(35);
        s.pop();
        System.out.print(s);
        System.out.println();
        for(int i:s){
            System.out.println(i);
        }
    }
}
