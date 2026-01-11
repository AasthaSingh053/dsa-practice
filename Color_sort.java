// Dutch National Flag problem: we only need to group values {0,1,2}.
// Use a single partitioning pass:
//   - All 0s move to the left
//   - All 2s move to the right
//   - All 1s remain in the middle
// Time Complexity: O(N)
// Space Complexity: O(1)
// (Radix sort would also be O(N) time but requires O(N) extra space, 
// so partitioning is more optimal here.)
import java.util.*;
class Solution{
    public static void partition(int[] nums){
        int right = nums.length-1;
        int left = 0;
        int i = 0;
        while(i<=right){
            if(nums[i] == 0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
            else if(nums[i] == 2){
                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;
            }
            else{
                i++;
            }
        }
        System.out.println("The array is"+Arrays.toString(nums));
    }

}
public class Color_sort{
    public static void main(String[] args) {
        System.out.println("Enter the Size 0f the Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];
        System.out.println("Enter elements");
        for(int i = 0;i<size;i++){
            n[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        obj.partition(n);

    }
}
    

