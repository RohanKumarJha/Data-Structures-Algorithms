class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_len = Integer.MAX_VALUE;

        for(String str : strs) {
            min_len = Math.min(str.length(), min_len);
        }

        while(min_len > 0) {
            String str = strs[0].substring(0,min_len);
            boolean flag = false;
            for(int i=0; i<strs.length; i++) {
                if(!str.equals(strs[i].substring(0, min_len))) {
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                return strs[0].substring(0,min_len);
            }
            min_len--;
        }
        return "";
    }
}
