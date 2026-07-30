class Solution {
    private void swap(int[] nums,int start,int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void moveZeroes(int[] nums) {
        int start=0, end=0;
        int size = nums.length;
        while(end < size) {
            if(nums[end] != 0) {
                swap(nums,start,end);
                start++;
            }
            end++;
        }
    }
}