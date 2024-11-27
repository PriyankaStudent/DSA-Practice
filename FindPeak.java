class FindPeak {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < nums[m + 1]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        FindPeak s = new FindPeak();
        int[] nums = {1, 2, 3, 1};
        System.out.println(s.findPeakElement(nums)); 
    }
}
