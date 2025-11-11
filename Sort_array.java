import java.util.Arrays;
public class Sort_array {
    public static void main(String[] args) {
        int[] a =  {4,2,7,5,9};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println("Sorted array:"+a[i]);
        }
        Arrays.sort(a,2,a.length-1);
        for(int i = 0;i<a.length;i++){
            System.out.println("Sorrted array from 2 to 4 is:"+a[i]);
        }
    }
}
