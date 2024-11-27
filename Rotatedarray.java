public class Rotatedarray {
    int findind(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i])
                return i;
        }
        return -1;
    }
    public static void main(String ar[]){
        int arr[]={4,5,6,7,0,1,2};
        int key=3;
        Rotatedarray ob=new Rotatedarray();
        int res=ob.findind(arr,key);
        System.out.println(res);
    }
}
