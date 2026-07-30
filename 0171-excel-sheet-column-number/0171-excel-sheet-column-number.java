class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();
        for(int i=0; i<length; i++) {
            result += (Math.pow(26,length-i-1)*(columnTitle.charAt(i)-'A'+1));
        }
        return result;
    }
}