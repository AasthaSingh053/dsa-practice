import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1 -> left to right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // 2 -> top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // 3 -> right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // 4 -> bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
public class SpiralMatrix {
    public static void main(String args[]){
        int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        Solution obj = new Solution();
        List<Integer>ans = obj.spiralOrder(arr);
        System.out.println(ans);

    }
}
