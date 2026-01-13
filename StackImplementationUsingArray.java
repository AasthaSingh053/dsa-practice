import java.util.*;
class Solution{
    public int top = 0;
    public int[] push(int[] nums,int x){
        if(top>99){
            System.out.println("Stack overflow");
            return nums;
        }
        nums[top++] = x;
        return nums;
    }
    public void pop(int[] nums){
        if(top == 0){
            System.out.println("No elements present");
        }
        else{
        top--;
        }
    }
    public void display(int[] nums){
        if(top == 0){
            System.out.println(top);
        }
        for(int i = 0;i<top;i++){
            {
            System.out.println(nums[i]);
        }
        }
    }
        public int peek(int[] nums){
            if(top == 0){
                System.out.println("No elements");
            }
            return nums[top-1];
        }
    }
public class StackImplementationUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[100];
        Solution obj = new Solution();
        int loop = 1;
        System.out.println("1 for push \n"+"2 for pop \n"+"3 for display\n"+"4 for peek");
        int choice = sc.nextInt();
        while(loop == 1){
        switch(choice){
            case 1 :{
                System.out.println("Enter data");
                int data = sc.nextInt();
                int[] stack = obj.push(nums,data);
        }break;
        case 2 :{
            obj.pop(nums);
        }break;
        case 3:{
            obj.display(nums);

        }break;
        case 4 :{
            int ans = obj.peek(nums);
            System.out.println(ans);
        }break;
        default : {
            System.out.println("Invalid Choice" );
        }break;
    }
    System.out.println("Do you wish to continue");
    loop = sc.nextInt();
}
    }
}
