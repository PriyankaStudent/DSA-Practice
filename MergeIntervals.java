import java.util.*;

class MergeIntervals {
    static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        
        int l = intervals[0][0];
        int r = intervals[0][1];
        
        for (int i = 1; i < n; i++) {
            if (r < intervals[i][0]) {
                ans.add(new int[]{l, r});
                l = intervals[i][0];
                r = intervals[i][1];
            } else if (r >= intervals[i][0] && r <= intervals[i][1]) {
                r = intervals[i][1];
            }
        }
        
        ans.add(new int[]{l, r});
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String ar[]){
        int[][] a={
            {1,3},
            {2,6,},
            {8,10},
            {15,18}
        };
        int[][] ans=merge(a);
        for(int[] i:ans){
            System.out.print(Arrays.toString(i));
        }
    }
}
