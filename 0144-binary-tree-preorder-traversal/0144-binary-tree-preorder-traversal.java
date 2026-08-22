class Solution {
    private List<Integer> inOrder(TreeNode root,List<Integer> list) {
        if(root == null) return list;
        list.add(root.val);
        inOrder(root.left,list);
        inOrder(root.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        return inOrder(root,new ArrayList<>());
    }
}