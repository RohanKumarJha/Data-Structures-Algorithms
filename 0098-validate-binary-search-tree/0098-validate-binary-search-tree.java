class Solution {
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        if(!isValidBST(root.left)) return false;
        if(prev!=null && root.val<=prev.val) return false;
        prev = root;
        return isValidBST(root.right);
    }
}

// 1,2,3
// 1,5,3,4,6
// isValid(root,-10000000,10000000)
// isValid(root.left,-100000000,root.val)
// isValid(root.right,root.val,10000000)
// isValid(7,5,10000000)
// isValid(6,5,7)
// isValid(3,5,10000000)

//                 5
//             1       7
//                   6   8
//                 3