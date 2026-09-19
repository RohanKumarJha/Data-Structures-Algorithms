class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        int actual_sum = len*(len+1)/2;

        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        return actual_sum - sum;

    }
}