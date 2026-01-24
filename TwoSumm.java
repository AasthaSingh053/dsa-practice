import java.util.*;
class Solution{
    public List<Integer> sums(int[] nums){
        int n= nums.length;
        List<Integer> sum = new ArrayList<>();
        for(int i = 0;i<n;i++){
    for(int j = i+1;j<n;j++){
        for(int k = j+1;k<n;k++){
            sum.add(nums[i]+nums[j]+nums[k]);
        }              
    }
}
    return sum;
    }
}
class TwoSumm{
    public static void main(String[] args) {
        int[] nums = new int[] {2,1,5,8,9,4,6};
        Solution obj = new Solution();
        List<Integer> ans = new ArrayList<>();
        ans = obj.sums(nums);
        System.out.println(ans);
    }
}