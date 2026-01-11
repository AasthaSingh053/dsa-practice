import java.util.*;
class Solution{
	public static int max_product(int[] nums){
		int maxSoFar = nums[0];
		int minSoFar = nums[0];
		int result = nums[0];
		if(nums.length == 0){
			return 0;
		}
		for(int i = 1;i<nums.length;i++){
			int current = nums[i];
			if(current < 0){
				int temp = maxSoFar;
				maxSoFar = Math.max(current,current*minSoFar);
				minSoFar = Math.min(current,current*temp);
			}
			else{
				maxSoFar = Math.max(current,current*maxSoFar);
				minSoFar = Math.min(current,current*minSoFar);
				result = Math.max(result,maxSoFar);
				}
			}
		return result;
		}
}
class Practice2{
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
        int result = obj.max_product(n);
        System.out.println("The Maximum Product Subarray is: " + result);

    }
}
