class Solution {
    private List<Integer> preOrder(List<Integer> list,Stack<TreeNode> st) {
        while(!st.isEmpty()) {
            TreeNode result = st.pop();
            if(result.right != null) st.push(result.right);
            if(result.left != null) st.push(result.left);
            list.add(result.val);
        }
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        return preOrder(list,st);
    }
}
