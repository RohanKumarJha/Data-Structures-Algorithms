class Solution {
    private boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    private void generate(int n,List<String> result, StringBuilder sb) {
        if(n == 0) {
            if(isValid(sb.toString())) {
                result.add(sb.toString());
            }
            return ;
        }
        // choose '('
        sb.append('(');
        generate(n-1, result, sb);
        sb.setLength(sb.length()-1);

        // choose ')'
        sb.append(')');
        generate(n-1, result, sb);
        sb.setLength(sb.length()-1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if(n == 0) return result;
        generate(2*n, result, new StringBuilder());
        return result;
    }
}