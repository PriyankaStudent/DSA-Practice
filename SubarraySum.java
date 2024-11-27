public class SubarraySum {
    public int findSum(int[] arr){
        int max_sum=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            max_sum=Math.max(max_sum+arr[i],arr[i]);
            res=Math.max(res,max_sum);
        }
    return res;
    }
    public static void main(String ar[]){
        SubarraySum ob=new SubarraySum();
        int[] arr={-2,-4};
        int res=ob.findSum(arr);
        System.out.println(res);
    }
}
