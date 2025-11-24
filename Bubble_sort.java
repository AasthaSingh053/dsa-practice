//Bubble sort
//Time complexity is  o(N^2)
//Space Complexity is 0(1)
import java.util.*;
class Solution{
    public void sort(int[] nums){
        for(int i= 0;i<nums.length;i++){
            for(int j = 0;j<nums.length-i-1;j++){
            if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
        }
        for(int i = 0;i<nums.length;i++){
            System.out.println("The sorted array is "+nums[i]);
        }
    }

class Bubble_sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        obj.sort(nums);
    }
}
}
