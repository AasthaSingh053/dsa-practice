/*I used  my own logic
import java.util.*;
class Merge_sort{
      public static void main(String args[]){
        int[] array = new int[] {2,3,5,1,4,9,6,8};
        int n = array.length;
        int left = 0;
        int right = 0;
        if(n%2==0){
           left = n/2;
            right = n/2;
        }
        else{
            left = (n+1)/2;
            right = n - left;
        }
        int[] a = Arrays.copyOfRange(array,0,left);
        int[] b = Arrays.copyOfRange(array,left,right);
        LinkedList<Integer> c = new LinkedList<>();
        int n1 = a.length,n2 = b.length,i= 0,j = 0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                c.add(a[i]);
                i++;
            }
            else{
                c.add(b[j]);
                j++;
            }
        }
        if(i<n1){
            c.add(a[i]);
            i++;
        }
        else if(j < n2){
            c.add(b[j]);
            j++;
        }
        System.out.println("the sorted array is"+c);
    }
}*/
//You use divide and conquer
//TC-->O(NlogN)
import java.util.*;
class Merge_sort{
    public static void mergeSort(int[] arr,int start,int end){
        //Recursive function
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            combine(arr,start,mid,end);
        }

    }
    public static void combine(int[] arr,int start,int mid,int end){
        int total_length = end-start+1;
       int[] c = new int[total_length];
        int i = start,j = mid+1,k = 0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
               c[k] = arr[i];
                i++;
                k++;

            }
            else{
                c[k] = arr[j];
                j++;
                k++;
            }

        }
        if(i<=mid){
            c[k] = arr[i];
            i++;
            k++;
        }
        else if(j<=end){
            c[k] = arr[j];
            j++;
            k++;
        }
        for(int t = 0;t<total_length;t++){
            arr[t] = c[t];
        }

    }
    public static void main(String args[]){
        int[] arr = new int[] {20,10,0,80,40,15};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for(int i = 0;i<arr.length;i++){
        System.out.println(Arrays.toString(arr));
        }

    }
}