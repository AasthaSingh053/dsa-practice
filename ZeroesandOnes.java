import java.util.*;
class Solution{
    public int ZeroesandOnes(int[] nums){
        int n= nums.length;
        int left = 0;
        int right = 0;
        int count = 0;
        int maxCount = 0;
        while(right < n){
            if(nums[right] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
                right++;
            }
            else{
                count = 0;
                left = right + 1;
                right++;
            }
        }
        return maxCount;
    }
}
public class ZeroesandOnes {
    public static void main(String args[]){
        int[] nums = new int[] {1,1,1,0,1,0,1,1,1,1,0,1};
        Solution obj = new Solution();
        int ans = obj.ZeroesandOnes(nums);
        System.out.println(ans);
    }
}
