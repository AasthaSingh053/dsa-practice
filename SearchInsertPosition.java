class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return n; // if target is greater than all elements
    }
}
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]  {1,2,3,4,5,9};
        Solution obj = new Solution();
        int ans = obj.searchInsert(nums,7);
        System.out.println(ans);
    }
}
