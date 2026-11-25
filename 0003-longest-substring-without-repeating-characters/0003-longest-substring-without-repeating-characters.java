class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int result=0;
        int start=0, end=0;
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                result = Math.max(result,end-start);
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
            }
        }
        return Math.max(result,end-start);
    }
}