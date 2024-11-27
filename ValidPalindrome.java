class ValidPalindrome {
    static boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        int l = 0, r = filtered.length() - 1;
        while (l < r) {
            if (filtered.charAt(l) != filtered.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String ar[]){
        String s="malayalam";
        System.out.println(isPalindrome(s));
    }
}
