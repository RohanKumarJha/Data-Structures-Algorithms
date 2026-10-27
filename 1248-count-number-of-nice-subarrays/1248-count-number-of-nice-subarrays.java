class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }

        int sum=0, result=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum-goal)) {
                result += map.get(sum-goal);
            } 
            if(map.containsKey(sum)) {
                map.put(sum,map.get(sum)+1);
            } else {
                map.put(sum,1);
            }
        }
        return result;
    }
}