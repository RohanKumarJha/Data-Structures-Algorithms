class Solution {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 1;
        for(int num : nums) {
            if(num == result) {
                count += 1;
            } else {
                if(count == 1) {
                    result = num;
                } else {
                    count -= 1;
                }
            }
        }
        return result;
    }
}
