class Solution {
    private List<Integer> preOrder(TreeNode root,List<Integer> list) {
        if(root == null) return list;
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        return preOrder(root,new ArrayList<>());
    }
}