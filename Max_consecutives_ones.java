import java.util.*;
class Solution{
    public int findMaxConsecutivesOnes(int[] nums){
        int maxCount = 0;
        int currentCount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                currentCount = 0;
            }
            else{
                currentCount++;
                maxCount = Math.max(maxCount,currentCount);
            }
        }
        return maxCount;
    }
}
    class Max_consecutives_ones{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            int nums[] = new int[size];
            System.out.println("Enter the elements of the array (0s and 1s only");
            for(int i = 0;i<size;i++){
                nums[i] = sc.nextInt();
            }
            Solution sol = new Solution();
            int result = sol.findMaxConsecutivesOnes(nums);
            System.out.println("The maximum number of consecutive 1s is: " + result);

    }
}
