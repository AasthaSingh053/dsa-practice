import java.util.*;
class Solution{
    int maxProduct(int[] nums){
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int ans = nums[0];
        for(int i =1;i<nums.length;i++){
               if(nums[i]<0){
                 int temp = max_so_far;
                 max_so_far = min_so_far;
                 min_so_far = temp;
               }
               max_so_far = Math.max(nums[i],max_so_far*nums[i]);
               min_so_far = Math.min(nums[i],min_so_far*nums[i]);
               ans = Math.max(ans,max_so_far);
             }
             return ans;
          }

    }

class Max_product{
    public static void main(String args[]){
        int[] n = new int[50];
        System.out.println("Enter the Size 0f the Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter elements");
        for(int i = 0;i<size;i++){
            n[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.maxProduct(n);
        System.out.println("The Maximum Product Subarray is: " + result);

    }
}
