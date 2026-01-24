import java.util.*;
class Solution{
    public int trap(int[] height) {
        int n = height.length;
        int[] max_left = new int[n];
        int[] max_right = new int[n];
        int water = 0;
        max_left[0] = height[0];
        if (n == 0) return 0;
        for(int i = 1;i<n;i++){
            if(max_left[i-1]  < height[i]){
                max_left[i] = height[i];
            }
            else{
                max_left[i] = max_left[i-1];
            }
        }
        for(int i = n-2;i>=0;i--){
            if(max_right[i+1]  < height[i]){
                max_right[i] = height[i];
            }
            else{
                max_left[i] = max_right[i+1];
            }
                }
            for(int i = 0;i<n;i++){
                water += Math.min(max_left[i],max_right[i])-height[i];
            }
            return water;
            
    }
}
class TrappingRainWater{
    public static void main(String args[]){
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution obj = new Solution();
        int ans = obj.trap(height);
        System.out.println(ans);
    }
}