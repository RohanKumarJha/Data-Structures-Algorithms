class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if (n < 2) return false;
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;

    }
}