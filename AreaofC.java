public class AreaofC {
    public int maxArea(int[] height) {
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
        AreaofC ob=new AreaofC();
        int[] height={3,1,2,4,5};
        int res=ob.maxArea(height);
        System.out.print(res);
    }
}
