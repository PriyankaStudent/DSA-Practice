class NonRepeatingCharacter {
    static final int MAX_CHAR = 26;

    static char nonRepeatingChar(String s) {
        int[] freq = new int[MAX_CHAR];
        for (char c : s.toCharArray()) 
            freq[c - 'a']++;
        for (int i = 0; i < s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return s.charAt(i);
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "racecar";  
        System.out.println(nonRepeatingChar(s));
    }
}