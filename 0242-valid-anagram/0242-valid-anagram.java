class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2) return false;

        Map<Character,Integer> map = new HashMap<>();

        int pointer = 0;
        while(pointer < len2) {
            if(map.containsKey(t.charAt(pointer))) {
                map.put(t.charAt(pointer),map.get(t.charAt(pointer))+1);
            } else {
                map.put(t.charAt(pointer),1);
            }
            pointer++;
        }

        pointer=0;
        while(pointer < len1) {
            if(map.containsKey(s.charAt(pointer))) {
                map.put(s.charAt(pointer),map.get(s.charAt(pointer))-1);
            } else {
                return false;
            }
            if(map.get(s.charAt(pointer)) == 0) map.remove(s.charAt(pointer));
            pointer++;
        }

        return true;
    }
}