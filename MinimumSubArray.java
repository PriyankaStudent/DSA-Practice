class MinimumSubArray {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int m = Integer.MAX_VALUE; 

        for (int r = 0; r < n; r++) {
            sum += nums[r]; 
            while (sum >= target) {
                m = Math.min(m, r - l + 1);
                sum -= nums[l]; 
                l++; 
            }
        }
        return m == Integer.MAX_VALUE ? 0 : m;
    }
    public static void main(String ar[]){
        int[] g={2,3,1,2,4,3};
        int t=7;
        System.out.print(minSubArrayLen(t, g));
    }
}
