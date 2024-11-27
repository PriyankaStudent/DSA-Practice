import java.util.Stack;

public class DeleteMiddleElement {
    public static void deleteMiddle(Stack<Integer> stack, int current, int size) {
        if (stack.isEmpty()) {
            return;
        }
        int middle = size / 2;
        if (current == middle) {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        deleteMiddle(stack, current + 1, size);
        stack.push(temp);
    }
    public static void deleteMiddleElement(Stack<Integer> stack) {
        deleteMiddle(stack, 0, stack.size());
    }
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        deleteMiddleElement(stack1);
        System.out.println(stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        deleteMiddleElement(stack2);
        System.out.println(stack2);
    }
}
