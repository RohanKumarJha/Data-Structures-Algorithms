class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int pointer = s.length()-1;
        while(pointer >= 0) {
            if(s.charAt(pointer) == ' ') {
                return s.length()-pointer-1;
            }
            pointer--;
        }
        return s.length();
    }
}