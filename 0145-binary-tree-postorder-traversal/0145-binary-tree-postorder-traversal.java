class Solution {

    private List<Integer> postOrder(List<Integer> list,Stack<TreeNode> st) {
        while(!st.isEmpty()) {
            TreeNode result = st.pop();
            if(result.left != null) st.push(result.left);
            if(result.right != null) st.push(result.right);
            list.add(0,result.val);
        }
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        return postOrder(list,st);
    }
}
