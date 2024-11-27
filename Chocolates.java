import java.util.Arrays;

public class Chocolates {
    static int minDiff(int[] arr,int m){
        if(m==0||arr.length==0||arr.length<m){
            return -1;
        }
        int mi=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-m;i++){
            int a=arr[i+m-1]-arr[i];
            mi=Math.min(mi,a);
        }
        return mi;
    }
    public static void main(String ar[]){
        int[] arr={7,3,2,4,9,12,56};
        int m=3;
        System.out.println(minDiff(arr,m));
    }
}
