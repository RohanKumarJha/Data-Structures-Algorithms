class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    curr.add(1);
                } else {
                    curr.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(new ArrayList<>(curr));
        }
        return list;
    }
}

// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1