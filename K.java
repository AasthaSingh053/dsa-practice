import java.util.*;
class Solution{
    public int longestSubstring(String s){
        int n = s.length();
        int left = 0;
        int maxLength = 1;
        Map<Character,Integer>map = new HashMap<>();
        ArrayList<String>ans = new ArrayList<>();
       for(int right = 0;right <n;right++){
            if(map.containsKey(Character.valueOf(s.charAt(right)))){
                left = Math.max(left, map.get(Character.valueOf(s.charAt(right))) + 1);
            }
            map.put(Character.valueOf(s.charAt(right)),right);
            maxLength = Math.max(maxLength,right-left+1);
         }
    return maxLength;
}
}
class K{
    public static  void main(String args[]){
                String s = "cabbzabcd";
                Solution obj = new Solution();
                int ans = obj.longestSubstring(s);
                System.out.println(ans);
    }
}
