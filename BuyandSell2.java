class BuyandSell2 {
    public static int maxProfit(int[] prices) {
        int b=prices[0];
        int tp=0;
        for(int i=1;i<prices.length;i++){
            if(i!=0){
                if(prices[i]>prices[i-1]){
                    tp=tp+prices[i]-prices[i-1];
                    b=prices[i];
                }
            }
        }
        return tp;
    }
    public static void main (String ar[]){
        int[] p={7,1,5,3,6,4};
        System.out.println(maxProfit(p));
    }
}