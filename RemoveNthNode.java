import java.util.*;
import java.math.*;
class Solution{
    public int[] closest(int[][] nums,int k){
        int[] ans = new int[2];
        double[] distanceA = new double[nums.length];
        double[] distanceB = new double[nums.length];
        for(int i = 0;i<nums.length;i++){
            int x1 = nums[i][0];
            int y1 = nums[i][1];
            int x2 = nums[i+1][0];
            int y2 = nums[i+1][1];
            distanceA[i] = (Math.pow(x1,2))+(Math.pow(y1,2));
            distanceB[i] = (Math.pow(x2,2))+(Math.pow(y2,2));
            Arrays.sort(n)
        }
        for(int i = 0;i<k;i++){
            if(i == k-1){
                ans[0] = nums[i][0];
                ans[1] = nums[i][1];
                break;
            }
        }
        return ans;
    }

}
public class RemoveNthNode {
    
}
