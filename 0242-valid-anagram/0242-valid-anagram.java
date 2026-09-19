class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2) return false;

        int[] character = new int[26];

        for(int i=0; i<len1; i++) {
            character[s.charAt(i)-'a']++;
        }

        for(int i=0; i<len2; i++) {
            if(character[t.charAt(i)-'a'] == 0) return false;
            character[t.charAt(i)-'a']--;
        }

        return true;

    }
}