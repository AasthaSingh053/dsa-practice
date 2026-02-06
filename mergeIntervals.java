import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        int i = 0;

        // Step 1: Add all intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ans.add(newInterval);

        // Step 3: Add remaining intervals
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
public class mergeIntervals {
    public static void main(String args[]){
        int[][] inetrvals = new int[][]     {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = new int[]       {4,8};
        Solution obj = new Solution();
        int[][] ans = obj.insert(inetrvals, newInterval);
        for(int i = 0;i<ans.length;i++){
            for(int j = 0;j<ans[0].length;j++){
                System.out.println(ans[i][j]);
            }
        }
    }
}
