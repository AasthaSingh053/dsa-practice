import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Create its transpose
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Now Reverse the matrix along x-axis
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(matrix));
    }
}
public class RotateMatrixBy90 {
    public static void main(String args[]){
        int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        Solution obj = new Solution();
        obj.rotate(arr);
    }
}
