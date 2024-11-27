class Search2DArr {
    public static boolean searchMatrix(int[][] m, int t) {
        int x=m.length;
        int y=m[0].length;
        int i=0,j=y-1;
        while(i<x && j>=0){
            if(m[i][j]==t) return true;
            if(m[i][j]>t) j--;
            else i++;
        }
        return false;
    }
    public static void main(String ar[]){
        int[][] m={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int t=3;
        System.out.print(searchMatrix(m, t));
    }
}