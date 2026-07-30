class Solution {
    int max_diameter = 0;

    private int diameter(TreeNode node) {
        if(node == null) return 0;
        int left = diameter(node.left);
        int right = diameter(node.right);
        max_diameter = Math.max(max_diameter,left+right);
        return 1 + Math.max(left,right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max_diameter;
    }
}