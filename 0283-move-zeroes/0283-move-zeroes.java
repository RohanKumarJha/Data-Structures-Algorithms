class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;

        int pointer=0;
        for(int i=0; i<len; i++) {
            if(nums[i] != 0) {
                nums[pointer++] = nums[i];
            }
        }
        while(pointer < len) {
            nums[pointer++] = 0;
        }
    }
}