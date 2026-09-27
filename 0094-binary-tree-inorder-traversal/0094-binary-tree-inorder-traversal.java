class Solution {
    class CheckTreeNode {
        TreeNode node;
        boolean flag;

        CheckTreeNode(TreeNode node,boolean flag) {
            this.node = node;
            this.flag = flag;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<CheckTreeNode> st = new Stack<>();
        st.push(new CheckTreeNode(root,false));

        while(!st.isEmpty()) {
            CheckTreeNode checkTreeNode = st.pop();
            if(checkTreeNode.flag == true) {
                result.add(checkTreeNode.node.val);
            } else {
                if(checkTreeNode.node.right != null) {
                    st.push(new CheckTreeNode(checkTreeNode.node.right,false));
                }
                st.push(new CheckTreeNode(checkTreeNode.node,true));
                if(checkTreeNode.node.left != null) {
                    st.push(new CheckTreeNode(checkTreeNode.node.left,false));
                }
            }
        }

        return result;

    }
}