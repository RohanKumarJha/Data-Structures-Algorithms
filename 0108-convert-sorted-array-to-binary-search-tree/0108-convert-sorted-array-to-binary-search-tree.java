class Solution {
    private TreeNode sortedArrayToBst(int[] nums,int start,int end) {
        if(start > end) return null;
        int mid = start + (end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBst(nums,start,mid-1);
        node.right = sortedArrayToBst(nums,mid+1,end);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int start=0,end=nums.length-1;
        int mid = start + (end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBst(nums,0,mid-1);
        node.right = sortedArrayToBst(nums,mid+1,end);
        return node;
    }
}