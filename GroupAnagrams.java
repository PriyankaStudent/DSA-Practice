import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map=new HashMap<>();
            for(String i:strs){
                char[] c=i.toCharArray();
                Arrays.sort(c);
                String s=new String(c);
                if(!map.containsKey(s)){
                    map.put(s,new ArrayList<>());
                }
                map.get(s).add(i);
            }
            return new ArrayList<>(map.values());
        }
        public static void main(String ar[]){
            String[] strs={"eat","tea","tan","ate","nat","bat"};
            System.out.print(groupAnagrams(strs));
    }
}