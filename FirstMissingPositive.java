class Solution{
    public int firstMissingPositive(int[] nums){
        int n= nums.length;
        for(int i = 0;i<n;i++){
        while(nums[i] > 0 && nums[i] < n && nums[i] != nums[nums[i]-1] ){
            int temp = nums[i];
            nums[i] = nums[temp-1];
            nums[temp-1] = temp;
            i++;
        }
    }
        for(int j = 0;j<n;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
}
class FirstMissingPositive{
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,4,5,6};
        Solution obj = new Solution();
        int ans = obj.firstMissingPositive(nums);
        System.out.println(ans);
    }
}