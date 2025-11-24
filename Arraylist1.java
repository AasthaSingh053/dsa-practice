import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(10);
        a.add(15);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        List<Integer>list = Arrays.asList (10,20,30,40);
        System.out.println("List elements:"+list);

    }

    
}
