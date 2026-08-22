class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String str = String.valueOf(x);
        int start=0, end=str.length()-1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}


// T.C        S.C
// O(n^2)   - O(1)
// O(nlogn) - O(1)
// O(n)     - O(n)
// O(n)     - O(1)
// O(log n) - O(1)