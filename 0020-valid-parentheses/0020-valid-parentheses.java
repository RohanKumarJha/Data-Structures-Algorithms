class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        for(Character ch : s.toCharArray()) {
            if(ch=='(' || ch=='[' || ch=='{') {
                list.add(ch);
            } else {
                if(list.size() == 0) {
                    return false;
                } else if(!(ch==')' && list.get(list.size()-1)=='(') &&
                            !(ch==']' && list.get(list.size()-1)=='[') &&
                            !(ch=='}' && list.get(list.size()-1)=='{')) {
                                return false;
                } else {
                    list.remove(list.size()-1);
                }
            }
        }
        return (list.size()==0) ? true : false;
    }
}