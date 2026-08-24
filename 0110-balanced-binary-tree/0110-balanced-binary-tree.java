class Solution {
    boolean result = true;

    private int balanced(TreeNode root) {
        if(root == null) return 0;
        int left = balanced(root.left);
        int right = balanced(root.right);
        if(Math.abs(left-right) > 1) {
            result = false;
        }
        return 1 + Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return result;
        balanced(root);
        return result;
    }
}
