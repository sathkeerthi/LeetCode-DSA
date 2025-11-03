class Solution {
    public boolean isPalindrome(String s) {
        // char[] c = s.toLowerCase().toCharArray();
        // StringBuffer sb = new StringBuffer();
        // for (char i : c){
        //     if ((i >= 'a' && i <= 'z') || (i >= '0' && i <= '9')){
        //         sb.append(i);
        //     }
        // }
        // System.out.println(sb);

        // for (int i = 0, j = sb.length()-1 ; i <= j ; i++, j--){
        //     if (sb.charAt(i) != sb.charAt(j))
        //         return false;
        // }
        // return true;

        // Using regex to improve time & space complexity
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        for (int left=0, right=s.length()-1 ; left <= right ; left++, right--){
            if (s.charAt(left) != s.charAt(right))
                return false;
        }
        return true;
    }
}