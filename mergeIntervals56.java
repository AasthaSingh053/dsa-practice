import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        // Step 2: Merge intervals
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                // Overlap → extend the current interval
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap → add current and move to next
                merged.add(current);
                current = intervals[i];
            }
        }
        merged.add(current);

        // Step 3: Convert list back to array
        return merged.toArray(new int[merged.size()][]);
    }
}
public class mergeIntervals56 {
    public static void main(String args[]){
        int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        Solution obj = new Solution();
        int[][] ans = obj.merge(intervals);
        System.out.println(ans.toString());
    }
}
