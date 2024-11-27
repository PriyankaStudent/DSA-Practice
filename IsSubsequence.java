class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sp=0,tp=0;
        while(sp<s.length() && tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        return sp==s.length();
    }
    public static void main(String main[]){
        String s="axc",t="ahbgdc";
        System.out.print(isSubsequence(s, t));
    }
}