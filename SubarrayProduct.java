// public class SubarrayProduct {
//     int findMax(int a,int b, int c){
//         int m=Math.max(a,Math.max(b,c));
//         return m;
//     }

//     int findMin(int a,int b, int c){
//         int m=Math.min(a,Math.min(b,c));
//         return m;
//     }

//     int findProd(int[] arr){
//         int max_prod=arr[0];
//         int x=arr[0];
//         int y=arr[0];
//         for(int i=1;i<arr.length;i++){
//             int t=findMax(arr[i],x*arr[i],y*arr[i]);
//             y=findMin(arr[i],x*arr[i],y*arr[i]);
//             x=t;
//             max_prod=Math.max(max_prod,x);
//         }
//     return max_prod;
//     }
//     public static void main(String ar[]){
//         SubarrayProduct ob=new SubarrayProduct();
//         int[] arr={-2,6,-3,-10,0,2};
//         int res=ob.findProd(arr);
//         System.out.println(res);
//     }
// }


public class SubarrayProduct {
    int findProd(int[] arr) {
        int max_prod = arr[0];
        int max_current = arr[0];
        int min_current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = max_current;
                max_current = min_current;
                min_current = temp;
            }
            max_current = Math.max(arr[i], max_current * arr[i]);
            min_current = Math.min(arr[i], min_current * arr[i]);
            max_prod = Math.max(max_prod, max_current);
        }
        
        return max_prod;
    }

    public static void main(String[] args) {
        SubarrayProduct ob = new SubarrayProduct();
        int[] arr = {2,-2,1};
        int result = ob.findProd(arr);
        System.out.println(result);
    }
}
