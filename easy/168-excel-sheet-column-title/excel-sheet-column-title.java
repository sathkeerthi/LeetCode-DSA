class Solution {
    public String convertToTitle(int columnNumber) {
        String s = "";
        while (columnNumber != 0){
            columnNumber--;
            int digit = columnNumber % 26;
            s = (char)(65+digit) + s;
            columnNumber /= 26;
        }
        return s;
    }
}