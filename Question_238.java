import java.util.*;
class solution{
    public void productExceptSelf(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        int[] ans = new int[nums.length];
        for(int i = 1;i<nums.length;i++){
           left[i] = left[i-1]*nums[i-1];
        }
        for(int i = nums.length-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i = 0;i<nums.length;i++){
            ans[i] = left[i]*right[i];
        }
        for(int i = 0;i<ans.length;i++){
        System.out.println("The product array is"+ans[i]);
        }
    }

}
class Question_238{
    public static void main(String args[]){
        int[] nums= new int[50];
        System.out.println("Enter the Size 0f the Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter elements");
        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        solution obj = new solution();
        obj.productExceptSelf(nums);
        System.out.println("The Product Array is: ");
    }
}
