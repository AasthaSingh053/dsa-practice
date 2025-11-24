//Counting sort is internally used in radix sortk
// Counting sort is stable
//asumming array size is N and maxNum is M
//therefore TC = 2N+2M,TC = O(N+M)
import java.util.*;
class Counting_sort{
    public static void main(String args[]){
        int[] arr = new int[] {2,5,1,4,3,9,8,1,10};
        int maxNum = find_max_element_in_array(arr);
        int[] freq = new int[maxNum+1];
        for(int num:arr){//O(N)
            freq[num]++;
         }
         //starting the loop from 1 becuz no cumulative needed for 0th index
         for(int i = 1;i<freq.length;i++){//O(M)
            freq[i] = freq[i]+freq[i-1];
         }
         // result method will have same length as thta of given array
         int[] result = new int[arr.length];
         for(int i = arr.length-1;i>=0;i--){//O(N)
            //To make counting sort stable we have to reverse the array
            int position = freq[arr[i]]-1;
            result[position] = arr[i];
            freq[arr[i]]--;
         }
         //freq = {0,2,1,1,1,1,0,0,1,2,1}.......frequency arr of arr
         //freq = {0,2,3,4,5,6,6,6,7,9,10}......cumulative
         //result = {1,1,2,3,4,5,9,10}
         System.out.println("Sorted array is"+Arrays.toString(result));

    }
    //Function to find max no in array
    public static int find_max_element_in_array(int[] arr){
        int result = arr[0];
         for(int i = 0;i<arr.length;i++){//O(N)
             if(arr[i] > result){
                    result = arr[i];

                }
             }
             return result;
            }

}
