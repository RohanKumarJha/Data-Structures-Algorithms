class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = m+n-1;
        int pointer1=m-1, pointer2=n-1;

        while(pointer1>=0 && pointer2>=0) {
            if(nums1[pointer1] < nums2[pointer2]) {
                nums1[pointer--] = nums2[pointer2--];
            } else {
                nums1[pointer--] = nums1[pointer1--];
            }
        }

        if(pointer1 == -1) {
            while(pointer2>=0) {
                nums1[pointer--] = nums2[pointer2--];
            }
        }
    }
}
