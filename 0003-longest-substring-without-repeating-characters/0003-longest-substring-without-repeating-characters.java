class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length = 0;
        int start=0, end=0;
        Set<Character> set = new HashSet<>();
        while(end < s.length()) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
            }
            max_length = Math.max(max_length,end-start);
        }
        return Math.max(max_length,set.size());
    }
}