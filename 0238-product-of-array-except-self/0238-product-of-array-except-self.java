class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int num_of_zero = 0;
        int product = 1;
        for(int i : nums) {
            if(i != 0) {
                product *= i;
            } else {
                num_of_zero++;
            }
        }
        if(num_of_zero == 0) {
            for(int i=0; i<size; i++) {
                nums[i] = product/nums[i];
            }
        } else if(num_of_zero == 1) {
            for(int i=0; i<size; i++) {
                if(nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            }
        } else {
            for(int i=0; i<size; i++) {
                nums[i] = 0;
            }
        }
        return nums;
    }
}