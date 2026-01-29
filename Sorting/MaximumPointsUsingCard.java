class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n= cardPoints.length;
        int leftsum = 0;
        int rightsum = 0;
        int maxSum = 0;
        for(int i = 0;i<k;i++){
            leftsum += cardPoints[i];
        }
        maxSum = leftsum;
        int rightIndex = n-1;
        for(int j = k-1;j>=0;j--){
            leftsum -= cardPoints[j];
            rightsum += cardPoints[rightIndex];
            maxSum = Math.max(maxSum,leftsum+rightsum);
            rightIndex--;
        }
        return maxSum;
    }
}
class MaximumPointsUsingCard{
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6};
        Solution obj = new Solution();
        int ans = obj.maxScore(nums,3);
        System.out.println(ans);

    }
}
