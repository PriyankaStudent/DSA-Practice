class Solution1 {
    public int maxProfit(int[] prices) {
        int b=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            int c=prices[i]-b;
            p=Math.max(p,c);
            b=Math.min(b,prices[i]);
        }
        return p;
    }
    public static void main(String pr[]){
        Solution1 o=new Solution1();
        int[] p={7,6,4,3,1};
        System.out.print(o.maxProfit(p));
    }
}

