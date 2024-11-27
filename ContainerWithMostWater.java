public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int a=0;
        int b=height.length-1;
        int area=0;
        while(a<b){
            int curr_a=Math.min(height[a],height[b])*(b-a);
            area=Math.max(area,curr_a);
            if(height[a]<height[b]){
                a++;
            }
            else{
                b--;
            }
        }
        return area;
    }
    public static void main(String ar[]){
        int[] h={1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(h));
    }
}
