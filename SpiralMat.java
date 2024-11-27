public class SpiralMat {
    static void spir(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int top=0, bot=m-1, l=0, r=n-1;
        while(top<=bot&&l<=r){
            for(int i=l;i<=r;i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for(int i=top;i<=bot;i++){
                System.out.print(arr[i][r] + " ");
            }
            r--;
            if(top <= bot){
                for(int i=r;i>=l;i--){
                    System.out.print(arr[bot][i] + " ");
                }
                bot--;
            }
            if(l<=r){
                for(int i=bot;i>=top;i--){
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
            
        }
    }
    public static void main(String ar[]){
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        spir(arr);
    }
}
