class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = size*(size+1)/2;
        int actual_sum = 0;
        for(int num : nums) {
            actual_sum += num;
        }
        return sum-actual_sum;
    }
}