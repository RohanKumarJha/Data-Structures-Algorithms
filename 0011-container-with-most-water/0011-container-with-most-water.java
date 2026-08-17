class Solution {
    public int maxArea(int[] height) {
        int max_water = 0;
        int left=0, right=height.length-1;
        while(left < right) {
            max_water = Math.max(max_water,(right-left)*Math.min(height[left],height[right]));
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_water;
    }
}