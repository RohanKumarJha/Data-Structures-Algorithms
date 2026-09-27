class Solution {
    private boolean result = false;

    private void pathSum(TreeNode node, int sum, int targetSum) {
        if(node == null) return ;
        sum += node.val;
        if(node.left==null && node.right==null) {
            if(sum == targetSum) {
                result = true;
            } return;
        }
        pathSum(node.left,sum,targetSum);
        pathSum(node.right,sum,targetSum);
    }
    

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return result;
        pathSum(root, 0, targetSum);
        return result;
    }
}
