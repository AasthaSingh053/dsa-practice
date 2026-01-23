import java.util.*;
public class QueueBuiltIn {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.offer(2);
        queue.offer(3);
        queue.remove();
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue);

    }
}
