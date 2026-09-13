class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;

        int[] postfix = new int[size];
        postfix[size-1] = 1;


        for(int i=size-2; i>=0; i--) {
            postfix[i] = nums[i+1] * postfix[i+1];
        }

        int product = 1;
        for(int i=0; i<size; i++) {
            int temp = nums[i];
            nums[i] = postfix[i] * product;
            product *= temp;
        }

        return nums;

    }
}
