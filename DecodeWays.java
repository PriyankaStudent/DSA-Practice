public class DecodeWays {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        int prev2 = 1; 
        int prev1 = 1; 
        for (int i = 1; i < n; ++i) {
            int current = 0;
            int oneDigit = s.charAt(i) - '0';
            int twoDigits = Integer.parseInt(s.substring(i - 1, i + 1));
            if (oneDigit != 0) {
                current += prev1;
            }
            if (10 <= twoDigits && twoDigits <= 26) {
                current += prev2;
            }
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String ar[]){
        String s="12";
        System.out.println(numDecodings(s));
    }
}
