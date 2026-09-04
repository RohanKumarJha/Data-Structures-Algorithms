class Solution {
    private boolean isPalindrome(String str) {
        int start=0,end=str.length()-1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String result = new String();
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                if(isPalindrome(s.substring(i,j+1))) {
                    result = (result.length() > j-i+1) ? result : s.substring(i,j+1);
                }
            }
        }
        return result;
    }
}