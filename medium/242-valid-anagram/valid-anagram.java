class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0 ; i < t.length() ; i++){
            if (!map.containsKey(t.charAt(i))) return false;

            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 1) - 1);
            map.remove(t.charAt(i), 0);
        }

        if (map.size() > 0) return false;
        return true;
    }
}