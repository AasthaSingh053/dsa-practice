import java.util.*;
public class Binary_search {
    public static void main(String args[]){
        int[] a = {2,4,3,9,6,8,4};
        Arrays.sort(a);
        for(int i =0;i<a.length;i++){
        System.out.println("array is:"+a[i]);
        }
        System.out.println("Enter element to be searched");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = Arrays.binarySearch(a,key);
        System.out.println(key+"Found at"+index);
        int index1 = Arrays.binarySearch(a,3,6,key);
        System.out.println(key+"Found at"+index1);
    }

}