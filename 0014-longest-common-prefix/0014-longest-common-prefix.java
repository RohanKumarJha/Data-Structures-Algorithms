class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_len = Integer.MAX_VALUE;
        for(String str : strs) {
            min_len = Math.min(min_len,str.length());
        }
        
        int pointer = min_len;
        while(pointer >= 0) {
            String result = strs[0].substring(0,pointer);
            boolean flag = false;
            for(int i=1; i<strs.length; i++) {
                if(!strs[i].substring(0,pointer).equals(result)) {
                    flag = true;
                }
            }
            if(!flag) return result;
            pointer--;
        }
        return "";
    }
}