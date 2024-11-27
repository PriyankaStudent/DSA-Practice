import java.util.HashSet;
import java.util.Set;

class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int m=0,l=0;
        for(int r=0;r<s.length();r++){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                m=Math.max(m,r-l+1);
            }
            else{
                while(s.charAt(l)!=s.charAt(r)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.remove(s.charAt(l));
                l++;
                set.add(s.charAt(r));
            }
        }
        return m;
    }
    public static void main (String ar[]){
        String s="gwwkew";
        System.out.print(lengthOfLongestSubstring(s));
    }
}