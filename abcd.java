import java.util.*;
class Solution{
    public int max_profit(int[] n){
       int current_profit = n[0];
       int max_profit = n[0];
        for(int i = 0;i<=n.length-1;i++){
            for(int j = i+1;j<=n.length-1;j++){
                current_profit = n[i] - n[j];
                max_profit = Math.max(max_profit,current_profit);
            }
            }
            return max_profit;
        }
    }
}
 class abcd{
    public static void main(String args[]){
        int[] n = new int[50];
        System.out.println("Enter the Size 0f the Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter elements");
        for(int i = 0;i<size;i++){
            n[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.max_profit(n);
        System.out.println("The Maximum Profit is: " + result);
    }
}
}