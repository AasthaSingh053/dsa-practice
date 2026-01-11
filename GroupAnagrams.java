import java.util.*;
class Solution{
    public List<List<String>> groupAnagrams(String[] str){
        Map<String,List<String>> map = new HashMap<>();
        for(String s :str){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(s);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[] {"eat","bat","nat","ate","tea"};
        Solution obj = new Solution();
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println("Grouped Anagram = "+result);
    }    
}
