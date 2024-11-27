import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class SubstringCon {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = words.length;
        int w = words[0].length();

        HashMap<String,Integer> map = new HashMap<>();
        for(String x : words)
        map.put(x, map.getOrDefault(x,0)+1);

        for(int i=0; i<w; i++){
            HashMap<String,Integer> t = new HashMap<>();
            int c = 0;
            for(int j=i,k=i; j+w <= n; j=j+w){
                String word = s.substring(j,j+w);
                t.put(word,t.getOrDefault(word,0)+1);
                c++;
                
                if(c==m){
                    if(map.equals(t)){
                        ans.add(k);
                    }
                    String remove = s.substring(k,k+w);
                    t.computeIfPresent(remove, (a, b) -> (b > 1) ? b - 1 : null);
                    c--;
                    k=k+w;
                }
            }
        }
        return ans;
    }
    public static void main(String ar[]){
        String[] str={"foo","bar"};
        String s="barfoothefoobarman";
        System.out.print(findSubstring(s, str));
    }
}

