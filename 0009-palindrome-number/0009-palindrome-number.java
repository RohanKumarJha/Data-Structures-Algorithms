class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x;
        int result = 0;
        while(temp != 0) {
            int rem = temp % 10;
            result = result*10 + rem;
            temp /= 10;
        }
        return (result == x) ? true : false;
    }
}

// T.C        S.C
// O(n^2)   - O(1)
// O(nlogn) - O(1)
// O(n)     - O(n)
// O(n)     - O(1)
// O(log n) - O(1)