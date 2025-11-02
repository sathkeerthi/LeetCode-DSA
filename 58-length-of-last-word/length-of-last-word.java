class Solution {
    public int lengthOfLastWord(String s) {
        // 1st attempt
        String[] words = s.trim().split(" ");
        return words[words.length-1].length();
    }
}