class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k %= size;
        int[] arr = new int[size];
        int pointer = 0;
        for(int i=size-k; i<size; i++) {
            arr[pointer++] = nums[i];
        }
        int index = 0;
        while(pointer < size) {
            arr[pointer++] = nums[index++];
        }
        for(int i=0; i<size; i++) {
            nums[i] = arr[i];
        }
    }
}
