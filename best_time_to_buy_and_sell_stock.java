import java.util.*;
class Solution{
    public int maxProfit(int[]prices){
        int minsoFar = prices[0];
        int ans = 0;
        for(int i =1;i<prices.length;i++){
            int profit = prices[i]-minsoFar;
         ans = Math.max(ans,profit);
        
            minsoFar = Math.min(minsoFar,prices[i]);    
    }
    return ans;

    }
    
}
class best_time_to_buy_and_sell_stock{
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
        int result = obj.maxProfit(n);
        System.out.println("The Maximum Profit is: " + result);
    }
}