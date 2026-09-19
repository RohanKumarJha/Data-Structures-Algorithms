class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;

        int[] arr = new int[len];
        int pointer=0;
        for(int num : nums) {
            if(num != 0) {
                arr[pointer++] = num;
            }
        }

        for(int i=0; i<len; i++) {
            nums[i] = arr[i];
        }
    }
}