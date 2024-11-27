class JumpGame {
    static int jump(int[] nums) {
        int t = 0, c = 0, far = 0;
        if (nums.length == 1) return 0;

        for (int i = 0; i < nums.length; i++) {
            far = Math.max(far, i + nums[i]);

            if (i == c) {
                if (c < nums.length - 1) {
                    t++;
                    c = far;
                }
            }
        }

        return t;
    }
    public static void main(String ar[]){
        int[] nums={2,3,1,1,4};
        System.out.print(jump(nums));
    }
}
