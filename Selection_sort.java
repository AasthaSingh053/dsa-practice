//selection sort
//  time complexity is o(N^2)
import java.util.*;
class I_hate_debugging{
    public void selectionSort(int[] nums){
        int n = nums.length;
        for(int i= 0;i<n;i++){
             int highestElement = nums[0];
             int indexofHighestelement = 0;
            for(int j= 0;j<n-i;j++){
                if(highestElement < nums[j]){
                    highestElement = nums[j];                    indexofHighestelement = j;
                }
            }
                int temp = nums[indexofHighestelement];
               nums[indexofHighestelement] = nums[n-i-1];
                nums[n-i-1] = temp;
            
        }
        for(int i= 0;i<n;i++){
            System.out.println("Sorted array is"+nums[i]);
        }
    }
}
class Selection_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] nums= new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("enter elements");
            nums[i] = sc.nextInt();

        }
        I_hate_debugging obj = new I_hate_debugging();
        obj.selectionSort(nums);
    }
}
