import java.util.Stack;
import java.util.HashMap;

public class NextGreaterElement {

    public static void printNextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> ngeMap = new HashMap<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ngeMap.put(current, -1);
            } else {
                ngeMap.put(current, stack.peek());
            }
            stack.push(current);
        }
        for (int num : arr) {
            System.out.println(num + " -> " + ngeMap.get(num));
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 25};
        System.out.println("Output for arr1:");
        printNextGreaterElement(arr1);

        int[] arr2 = {13, 7, 6, 12};
        System.out.println("\nOutput for arr2:");
        printNextGreaterElement(arr2);
    }
}
