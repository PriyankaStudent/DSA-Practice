class MinWinSub {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        int[] targetCount = new int[128];
        for (char c : t.toCharArray()) {
            targetCount[c]++;
        }
        int left = 0, right = 0, start = 0, minLength = Integer.MAX_VALUE;
        int requiredCount = t.length();
        char[] chars = s.toCharArray();
        while (right < chars.length) {
            if (targetCount[chars[right]] > 0) {
                requiredCount--;
            }
            targetCount[chars[right]]--;
            right++;
            while (requiredCount == 0) {
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }
                targetCount[chars[left]]++;
                if (targetCount[chars[left]] > 0) {
                    requiredCount++;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); 
    }
}
