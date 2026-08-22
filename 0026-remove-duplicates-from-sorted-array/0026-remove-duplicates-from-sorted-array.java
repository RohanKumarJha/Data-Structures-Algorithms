class Solution {
    public int removeDuplicates(int[] nums) {
        int prevValue = nums[0];
        int start = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != prevValue) {
                nums[start++] = nums[i]; 
                prevValue = nums[i];
            }
        }
        return start;
    }
}
