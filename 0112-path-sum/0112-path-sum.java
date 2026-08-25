class Solution {
    private boolean pathSum(TreeNode root,int targetSum,int sum) {
        if(root == null) {
            return false;
        }
        sum += root.val;
        if(root.left==null && root.right==null) {
            return sum == targetSum;
        }
        return pathSum(root.left,targetSum,sum) || pathSum(root.right,targetSum,sum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return pathSum(root,targetSum,0);
    }
}