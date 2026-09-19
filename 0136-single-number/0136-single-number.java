class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;

        Arrays.sort(nums);
        for(int i=1; i<len; i+=2) {
            if(nums[i] != nums[i-1]) return nums[i-1];
        }        
        return nums[len-1];
    }
}