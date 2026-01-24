import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        int fp = 0; // left pointer
        Map<Character, Integer> map = new HashMap<>();

        for (int sp = 0; sp < n; sp++) { // right pointer
            addToMap(map, s.charAt(sp));

            // shrink window if invalid (duplicate found)
            while (!isValid(map)) {
                deleteFromMap(map, s.charAt(fp));
                fp++;
            }

            int length = sp - fp + 1;
            ans = Math.max(ans, length);
        }
        return ans;
    }

    public void addToMap(Map<Character, Integer> map, char c) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    public void deleteFromMap(Map<Character, Integer> map, char c) {
        map.put(c, map.get(c) - 1);
        if (map.get(c) == 0) {
            map.remove(c);
        }
    }

    public boolean isValid(Map<Character, Integer> map) {
        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                return false; // invalid if any char repeats
            }
        }
        return true;
    }
}
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcadabca";
        Solution obj = new Solution();
        int ans = obj.lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
