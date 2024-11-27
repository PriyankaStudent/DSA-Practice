class SearchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            index=i;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<target && nums[i+1]>target)
            index=i+1;
        }
        if(nums[nums.length-1]<target)
        index=nums.length;
        return index;
    }
    public static void main(String sr[]){
        int[] num={1,3,5,6};
        int t=5;
        System.out.print(searchInsert(num, t));
    }
}