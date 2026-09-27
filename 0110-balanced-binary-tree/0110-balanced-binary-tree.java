class Solution {
    private boolean result = true;

    private int height(TreeNode node) {
        if(node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        if(Math.abs(left-right) > 1) {
            result = false;
        }
        return 1 + Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return result;
        height(root);
        return result;
    }
}