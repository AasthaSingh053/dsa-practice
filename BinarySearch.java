import java.util.*;
class Solution{
    public int binarySearch(int[] nums,int key){
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        while(start!=end){
            if(key < nums[mid]){
                start = mid+1;
            }
            else if(key > nums[mid]){
                end = mid-1;
            }
            else{
                return mid+1;
            }
        }
        return 0;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]  {2,4,6,8,10};
        int key = 6;
        Solution obj = new Solution();
        System.out.println(obj.binarySearch(nums, key));

    }
}
