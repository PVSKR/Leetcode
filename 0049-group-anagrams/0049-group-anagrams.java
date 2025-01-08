import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            ans.putIfAbsent(sorted, new ArrayList<>());
            ans.get(sorted).add(s);
        }
        return new ArrayList<>(ans.values());

    }
}