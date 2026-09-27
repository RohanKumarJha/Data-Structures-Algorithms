class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);

        while(!qu.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = qu.size();
            for(int i=0; i<size; i++) {
                TreeNode node = qu.remove();
                if(node.left != null) qu.add(node.left);
                if(node.right != null) qu.add(node.right);
                list.add(node.val);
            }
            result.add(new ArrayList<>(list));
        }

        // [[1],[2,3],[5,4]]
        // [1,3,4]

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            answer.add(result.get(i).get(result.get(i).size() - 1));
        }

        return answer;
    }
}
