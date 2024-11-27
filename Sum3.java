import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sum3 {
    public static List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            if(i>0 && n[i]==n[i-1]) continue;
            int j=i+1,k=n.length-1;
            while(j<k){
                int t=n[i]+n[j]+n[k];
                if(t>0) k--;
                else if(t<0) j++;
                else{
                    res.add(Arrays.asList(n[i],n[j],n[k]));
                    j++;
                    while(n[j]==n[j-1] && j<k) j++;
                }
            }
        }
        return res;
    }
    public static void main(String ar[]){
        int[] n={-1,0,1,2,-1,-4};
        System.out.print(threeSum(n));
    }
}