//TC = O(N);
//SC = O(N);
import java.util.*;
class Solution{
    public int[] calcTwoSum(int[] nums,int target){
        Map<Integer,Integer> map = new  HashMap<>();
        int key = 0;
        for(int i = 0;i<nums.length;i++){
            key = target-nums[i];
            if(map.containsKey(key)){
                 int[] arr = { map.get(key), i };;
                 return arr;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
class Two_sum{
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        int[] ans = new int[2];
        Solution obj = new Solution();
        ans = obj.calcTwoSum(nums, 5);
        for(int i = 0;i<ans.length;i++){
        System.out.println("Ans = "+Arrays.toString(ans));
        }
}
}
