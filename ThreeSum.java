import java.util.*;
class Solution{
    public List<List<Integer>> findThreeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        Arrays.sort(nums);
        int n = nums.length;
        while(i<n){
            if(i>=1 && nums[i] == nums[i-1]){
            i++;
           continue;
            }
        int target = -nums[i];
        List<List<Integer>> pairs = twoSum(nums,target,i+1);
        for(List<Integer> pair : pairs){
            List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[i]);
            triplet.add(pair.get(0));
            triplet.add(pair.get(1));
             ans.add(triplet);
        }
        i++;
    }
       
        return ans;
    }
    public List<List<Integer>> twoSum(int[] nums,int target,int start){
     int f = start,s = nums.length-1;
     int end = nums.length-1; 
     List<List<Integer>> pairs = new ArrayList<>();
     while(f<s){
        if(f>=start+1 && nums[f] == nums[f-1]){
            f++;
            continue;
               }
               if(s+1>=end && nums[s] == nums[s-1]){
            s++;
            continue;
               }
               if(nums[f]+nums[s] > target){
                s--;
               }
               if(nums[f]+nums[f] < target){
                f++;
               }
               if(nums[f]+nums[s] == target){
                List<Integer> pair = new ArrayList<>();
                pair.add(nums[f]);
                pair.add(nums[s]);
                pairs.add(pair);
                f++;
               }
         }
         return pairs;
    }
}
public class ThreeSum {
    public static void main(String args[]){
        int[] nums = new int[] {1,-2,4,-5,3,2,0};
        Solution obj = new Solution();
        List<List<Integer>> triplet = obj.findThreeSum(nums);
        System.out.println(triplet);

    }
}
