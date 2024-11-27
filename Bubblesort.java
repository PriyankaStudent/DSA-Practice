public class Bubblesort {
    static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean s=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    s=true;
                }
            }
            if(s==false){
                break;
            }
        }
        return arr;
    }
    public static void main(String ar[]){
        int[] arr={4,1,3,9,7};
        int[] res=sort(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
