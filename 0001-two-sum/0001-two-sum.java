class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

// T.C         S.C
// O(n^2)   - O(1)
// O(nlogn) - O(1)
// O(n)     - O(n)
// O(n)     - O(1)
// O(log n) - O(1)