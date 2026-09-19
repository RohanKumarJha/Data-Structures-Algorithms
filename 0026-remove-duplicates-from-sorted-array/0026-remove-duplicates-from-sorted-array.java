class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;

        int[] arr = new int[len];
        arr[0] = nums[0];

        int pointer=1;
        for(int i=1; i<len; i++) {
            if(nums[i] != nums[i-1]) {
                arr[pointer++] = nums[i];
            }
        }
        
        for(int i=0; i<len; i++) {
            nums[i] = arr[i];
        }

        return pointer;
    }
}