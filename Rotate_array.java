// Standard problem: Rotate Array
import java.util.*;
class Solution{
    public void rotate(int[] nums,int k){
        int n = nums.length;
        k = k % n; // Handle cases where k >= n
        reverse(nums,0,n-1);        // Step1: Reverse the entire array
        reverse(nums,0,k-1);   // Step2 :Reverse the first k elements
        reverse(nums,k,n-1); //Step3: Reverse the remaining elements
        System.out.println("Array after rotation ");
        for(int i = 0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
// Helper function to reverse a portion of the array
void reverse(int[] nums,int start,int end){
    int i,j;
    i=start;
    j=end;
    while(i<j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
}
}
class Rotate_array{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        sol.rotate(nums,k);
        System.out.println(Arrays.toString(nums)); // Output: [5,6,7,1,2,3,4]
    }
}