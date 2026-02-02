import java.util.HashMap;
import java.util.Map;
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int left = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add current fruit to map
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // Shrink window if more than 2 types
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            // Update max length
            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}
public class FruitsintoBuckets {
    public static void main(String args[]){
        int[] fruits = new int[]    {3,3,3,2,1,1,1,2,3,4,4};
        Solution obj = new Solution();
        int ans = obj.totalFruit(fruits);
        System.out.println(ans);
    }
}
