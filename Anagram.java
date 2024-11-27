import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();
        
        System.out.println(isAnagram(s1, s2));
        
        scanner.close();
    }
}
