class TwoSum {
    public static int[] twoSum(int[] n, int t) {
        int l=0,r=n.length-1;
        int[] res=new int[2];
        while(l<r){
            if((n[l]+n[r])==t){
                res[0]=l+1;
                res[1]=r+1;
                break;
            }
            else if((n[l]+n[r])<t){
                l++;
            }
            else r--;
        }
        return res;
    }
    public static void main(String ar[]){
        int[] n={2,7,11,15};
        int t=9;
        int[] res=twoSum(n, t);
        for(int i : res)
        System.out.print(i+" ");
    }
}