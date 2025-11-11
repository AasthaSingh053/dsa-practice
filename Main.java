import java.util.*;
class Tuple implements Comparable<Tuple> {
    public int a,b;
    public tuple(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
    @Override
    public String toString(){
        return "a="+a+"b="+b;
    }
    @Override
    public int compareTo(Tuple other){
        if(this.b != other.b)
        {
            return this.b - other,b;
        }
        else{
            return this.a - other.a;
        }
    class Main{
        public static void main(String[] args) {
            Tuple[] arr = new Tuple[5];
            arr[0] = new Tuple(1, 3);
            arr[1] = new Tuple(2, 2);
            arr[2] = new Tuple(3, 3);
            arr[3] = new Tuple(4, 1);
            arr[4] = new Tuple(5, 2);
            Arrays.sort(arr);
            System.out.println(arr[i].toString());

        }
    }

