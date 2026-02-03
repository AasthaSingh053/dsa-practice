class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int height1 = Math.min(height[left],height[right]);
            int width1 = right-left;
            maxArea = Math.max(maxArea,height1*width1);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
class ContainerwithMostWater {
    public static void main(String args[]){
        int[] height = new int[] {2,3,4,1};
        Solution obj = new Solution();
        int ans = obj.maxArea(height);
        System.out.println(ans);
    }
}
