
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int size = nums.length;
        int len = Integer.MAX_VALUE;

        int start = 0, end = 0, sum = 0;

        while (end < size) {

            sum += nums[end];

            while (sum >= target) {
                len = Math.min(len, end - start + 1);

                sum -= nums[start];
                start++;
            }

            end++;
        }

        return len == Integer.MAX_VALUE ? 0 : len;
    }
}
