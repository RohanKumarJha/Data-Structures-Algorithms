class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        list.add(new ArrayList<>(prev));
        if(numRows == 1) return list;
        for(int i=1; i<numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1; j<i; j++) {
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            list.add(new ArrayList<>(curr));
            prev = curr;
        }
        return list;
    }
}
          
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1