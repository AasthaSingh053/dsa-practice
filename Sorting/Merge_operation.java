//TC --> O(M*N)
import java.util.*;
class Merge_operation{
    public static void main(String[] args) {
        int[] a = new int[] {2,5,8,9,10};
        int[] b = new int[] {2,4,7,18};
       LinkedList <Integer> c = new LinkedList<>();
        int i = 0,j= 0,n= a.length,m = b.length;
        while(i<n && j<m){
                if(a[i] <= b[j]){
                    c.add(a[i]);
                    i++;
                }
               else{
                    c.add(b[i]);
                    j++;

                }
                

                }
                if(i<n){
                    c.add(a[i]);
                    i++;

                }
                else if(j<m){
                    c.add(b[j]);
                    j++;
                }
            
            
                System.out.println("the merged array is"+c);                ;
            

        }
    }

            
