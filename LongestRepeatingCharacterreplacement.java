import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] count = new int[26];
        int maxCount = 0;
        int maxLength = 0;
        int start = 0;
        for(int end = 0;end < n;end++){
            maxCount = Math.max(maxCount,++count[s.charAt(end)-'A']);
            while(end-start+1-maxCount > k){
                count[s.charAt(start)-'A']--;
                start++;
            }
            maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}
public class LongestRepeatingCharacterreplacement {
   public static void main(String[] args) {
    String s = "ABAB";
    int k = 2;
    Solution obj = new Solution();
    int ans = obj.characterReplacement(s, k);
    System.out.println(ans);
   } 
}
