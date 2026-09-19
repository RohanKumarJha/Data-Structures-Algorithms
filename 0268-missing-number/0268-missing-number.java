class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        int pointer=0;

        while(pointer <= len) {
            boolean flag = false;
            for(int i=0; i<len; i++) {
                if(pointer == nums[i]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) return pointer;
            pointer++;
        }
        return -1;
    }
}