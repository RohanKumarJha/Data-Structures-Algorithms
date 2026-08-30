class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums1) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums2.length; i++) {
            if(set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}