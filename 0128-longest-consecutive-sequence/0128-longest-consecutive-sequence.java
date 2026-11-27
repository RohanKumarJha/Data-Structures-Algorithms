
class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int result = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int count = 1;
                int current = num;

                while (set.contains(current + 1)) {
                    count++;
                    current++;
                }

                result = Math.max(result, count);
            }
        }

        return result;
    }
}
