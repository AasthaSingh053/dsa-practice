import java.util.*;
public class StackMethod {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(19);
        stack.push(25);
        stack.pop();
        System.out.println(stack.peek());

    }
}
