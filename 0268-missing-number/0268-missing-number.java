class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int pointer=0;
        while(pointer <= len) {
            if(!set.contains(pointer)) {
                return pointer;
            }
            pointer++;
        }

        return -1;
    }
}