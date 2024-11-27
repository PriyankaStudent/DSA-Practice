import java.util.Arrays;
public class Solution {
    public static String largestNumber(String[] arr) {
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }
        return String.join("", arr);
    }
    public static void main(String[] args) {
        String[] arr = {"3", "30", "34", "5", "9"};
        System.out.println(largestNumber(arr));
    }
}
