import java.util.Scanner;
class Array{
    public static void main(String args[])
    {
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("The array element is" 
        + arr[i]);
         }
    }
}
