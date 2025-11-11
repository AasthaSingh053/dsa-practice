 // LeetCode Problem 53 - Maximum Subarray
// Approach: Kadane's Algorithm - Efficient O(n) solution
// Finds the contiguous subarray with the largest sum using dynamic programming.
// Time Complexity: O(n), Space Complexity: O(1)
 import java.util.*; 
 class Solution{
    public int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int current_sum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            max_so_far = Math.max(max_so_far, current_sum);
        }
        
        return max_so_far;
    }
}

public class Max_subarray{
    public static void main(String[] args) {
        int[] n = new int[50];
        System.out.println("Enter the Size 0f the Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter elements");
        for(int i = 0;i<size;i++){
            n[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.maxSubArray(n);
        System.out.println("The Maximum Subarray is: " + result);

    }
}
    
