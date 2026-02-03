class Solution{
    public int fruitsInBucket(int[] nums){
        int n = nums.length;
        int n1 = nums[0];
        int n2 = nums[1];
        int left = 0;
        int right = 1;
        int maxCount = 1;
        while(left < right && right < n){
            if((nums[left] == n1 && nums[right] == n2) || (nums[left] == n1 && nums[right] == n1)
                || (nums[left] == n2 && nums[right] == n2)  || (nums[left] == n1 && nums[right] == n2)){
                    maxCount = Math.max(maxCount,right-left+1);
                }
                else{
                    n1 = nums[left];
                    n2 = nums[right];
                   
                }
                right++;
                left++;
                
        }
        return maxCount;
    }
}
public class FruitsinBucKet {
    public static void main(String args[]){
        int[] nums = new int[]  {3,3,3,1,2,1,2,3,4,4};
        Solution obj =   new Solution();
        int ans = obj.fruitsInBucket(nums);
        System.out.println(ans);
    }
}
