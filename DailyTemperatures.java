import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] ans = new int[temperatures.length];
        for(int i = 1;i<n;i++){
             while(stack.size() > 0 && temperatures[stack.peek()] < temperatures[i]){
                    int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
                }
                stack.push(i);
        }
       while(stack.size() > 0){
           ans[stack.peek()] = 0;
            stack.pop();
        }
        return ans;
    }
}

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = new int[] {72,78,74,71,75,74,76};
        Solution obj = new Solution();
        int[] ans = new int[temperatures.length];
        ans = obj.dailyTemperatures(temperatures);
    }
}
