class Solution {
    private void subset(int index,int[] nums,List<Integer> list,List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(list));
            return ;
        }
        // Not taken
        subset(index+1,nums,list,result);

        // Taken
        list.add(nums[index]);
        subset(index+1,nums,list,result);

        // backtrack
        list.remove(list.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(0,nums,new ArrayList<>(),result);
        return result;
    }
}