class Solution {

    private void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void moveZeroes(int[] nums) {
        int left=0, right=0;
        while(right < nums.length) {
            if(nums[right] != 0) {
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }
}