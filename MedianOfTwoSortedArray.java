import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] ans = mergeTwoSortedArrays(nums1, nums2);
       double median = 0;
        if(ans.length %2 == 0){
            median = (ans[((ans.length)/2)-1] + ans[((ans.length)/2)])/2.0;
        }
        else{
            median = ans[(ans.length)/2];
        }
        return median;
 }
    public int[] mergeTwoSortedArrays(int[] nums1,int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        List<Integer> mergedArray = new ArrayList<>();
        int i = 0,j = 0;
        while(i<m && j<n){
            if(nums1[i] >= nums2[j]){
                mergedArray.add(nums2[j]);
                j++;
            }
            else if(nums1[i] < nums2[j]){
                mergedArray.add(nums1[i]);
                i++;
                }
        }
        while (i < m) {
            mergedArray.add(nums1[i]);
            i++;
        }
        while (j < n) {
            mergedArray.add(nums2[j]);
            j++;
        }
        int[]  ans =  new int[mergedArray.size()];
        for(int k =0;k<mergedArray.size();k++){
            ans[k] = mergedArray.get(k);
        }
        return ans;
    }
}
public class MedianOfTwoSortedArray {
    public static void main(String[] args){
        int[] n1 = new int[] {1,2,3};
        int[] n2 = new int[] {2,3,4};
        Solution obj = new Solution();
        double ans = obj.findMedianSortedArrays(n1,n2);
        System.out.println(ans);
}
}
