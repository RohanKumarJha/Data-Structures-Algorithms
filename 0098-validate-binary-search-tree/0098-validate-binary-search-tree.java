class Solution {
    private void validBst(TreeNode node,List<Integer> list) {
        if(node == null) return ;
        validBst(node.left,list);
        list.add(node.val);
        validBst(node.right,list);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        validBst(root,list);
        for(int i=1; i<list.size(); i++) {
            if(list.get(i) <= list.get(i-1)) return false;
        }
        return true;
    }
}