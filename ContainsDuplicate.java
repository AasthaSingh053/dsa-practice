import java.util.*;
class Solution{
    public boolean containsDuplicate(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(!map.containsKey(n)){
            map.put(n,0);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[50];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        boolean tell =obj.containsDuplicate(nums);
        System.out.println("tell" +tell);

    }
    
}
