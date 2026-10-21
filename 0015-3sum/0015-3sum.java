class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<len-2; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1, right=len-1;
            while(left < right) {
                List<Integer> list = new ArrayList<>();
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0) {
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(new ArrayList<>(list));
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}