class Solution {
    public boolean isAnagram(String s, String t) {
        // Map<Character, Integer> m = new HashMap<>();
        // if(s.length() != t.length()) return false;
        // for(int i=0; i<s.length(); i++){
        //     m.put(s.charAt(i), m.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0; i<t.length(); i++){
        //     if(!m.containsKey(t.charAt(i)) || m.get(t.charAt(i)) == 0) return false;
        //     m.put(t.charAt(i), m.get(t.charAt(i))-1);
        // }
        // return true;

        if(s.length()!= t.length()) return false;
        int[] ans = new int[26];
        for(int i=0; i<s.length(); i++){
            ans[s.charAt(i) - 'a']++;
            ans[t.charAt(i) - 'a']--;
        }
        for(int x: ans) if(x!=0) return false;
        return true;
    }
}