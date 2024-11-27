import java.util.Arrays;
public class Closest3Sum {
    static int threeSumClosest(int[] nums, int target) {
        int c=Integer.MAX_VALUE;
        int l,r;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            l=i+1;
            r=nums.length-1;
            while(l<r){
                int s=nums[i]+nums[l]+nums[r];
                if(s>target)
                    r--;
                else
                    l++;
                if(Math.abs(s-target)<Math.abs(c-target)){
                    c=s;
                }
            }
        }

        return c;
    }
    public static void main(String ar[]){
        int[] nums={-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 2));
    }
}
