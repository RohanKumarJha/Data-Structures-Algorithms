class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
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