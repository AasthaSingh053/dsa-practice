import java.util.*;
class Solution{
    public static int majority_element(int[] nums){
       int mc = nums[0];
       int count = 0;
       for(int i = 1;i<nums.length;i++){
        if(nums[i] == mc){
            count++;
        }
        else{
            count--;
            if(count == 0){
                mc = nums[i];
                count = 1;
            }
        }
       }
           return mc;
    }

}
class Majority_element{
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
        int result = obj.majority_element(n);
        System.out.println("The Majority element is " + result);

    }
}
