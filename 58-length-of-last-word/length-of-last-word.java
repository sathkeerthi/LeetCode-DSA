class Solution {
    public int lengthOfLastWord(String s) {
        // 1st attempt
        // String[] words = s.trim().split(" ");
        // return words[words.length-1].length();

        // Better approach
        int i = s.length()-1;
        int count = 0;
        while (i >= 0 && s.charAt(i) == ' ')
            i--;
        
        while (i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
}