class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        if(nums[e] > nums[s]){
            return nums[s];
        }
        return minElement(nums, s, e);
    }

    public static int minElement(int[] nums, int s, int e) {
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid+1];
            }
            if (nums[mid] >= nums[s]) {
                s = mid + 1;
            } else { 
                e = mid;
            }
        }
        return nums[s];
    }
}