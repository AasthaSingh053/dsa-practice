import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        if(intervals == null || intervals.length == 0){
        return 0;
       }
       //Sort through End time
       Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));
       int end = intervals[0][1];
       for(int i = 1;i<intervals.length;i++){
        int[] interval  = intervals[i];
        if(interval[0]<end){
            count++;
        }
        else{
            end = interval[1];
        }
       }
       return count;
    }
}
 class NonOverlappingIntervals {
    public static void main(String[] args){
        int[][] intervals = new int[][] {{1,2},{2,3},{3,4},{1,3}};
        Solution obj = new Solution();
        System.out.println(obj.eraseOverlapIntervals(intervals));
    }
}
