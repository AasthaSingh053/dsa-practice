import java.util.*;
class Radix_sort{
    public static void main(String args[]){
        int arr[] = new int[] {10,345,23,189,94,68};
         int maxNum = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxNum){
                maxNum = Math.max(maxNum,arr[i]);
            }

        }
        for(int place = 1;maxNum/place>0;place*=10){
        radixsort(arr,place);
        }
         for(int i = 0;i<arr.length;i++){
        System.out.println("Sorted array is"+arr[i]);
         }




    }
    public static void radixsort(int[] arr,int place){
        int[] freq = new int[10];//0-9
        int[] result = new int[arr.length];
        for(int i= 0;i<arr.length;i++){
            int key = (arr[i]/place)%10;
            freq[key]++;
        }
        for(int i = 1;i<freq.length;i++){
            freq[i] = freq[i-1]+freq[i];
        }
        for(int i = arr.length-1;i>=0;i--){
            int key =  (arr[i]/place)%10;
            int position = freq[key]-1;
            result[position] = arr[i];
            freq[key]--;
            
        }
        for(int i = 0;i<result.length;i++){
            arr[i] = result[i];
        }
        
    }
  
}


