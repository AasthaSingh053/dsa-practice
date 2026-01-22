import java.util.*;
class Solution{
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer>stack = new Stack<>();
        stack.push(0);
        int[] ans = new int[nums.length];
        for(int i = 1;i<n;i++){
             while(stack.size() > 0 && nums[stack.peek()]<nums[i]){
                    ans[stack.peek()] =  nums[i];
                    stack.pop();
                }
                stack.push(i);
        }
        for(int i = 0;i<n;i++){
            while(stack.size()>0 && nums[stack.peek()] < nums[i]){
                ans[stack.peek()] = nums[i];
                stack.pop();
            }
        }
        while(stack.size() > 0){
            ans[stack.peek()] = -1;
            stack.pop();
        }
        return ans;
    }
}
public class NextGreaterElement {
    
}
