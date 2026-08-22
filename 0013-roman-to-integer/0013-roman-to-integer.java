class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        int answer = 0;
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            if(i == 0) {
                sum = map.get(s.charAt(i));
            } else {
                if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
                    sum = map.get(s.charAt(i)) - sum;
                } else {
                    answer += sum;
                    sum = map.get(s.charAt(i));
                }
            }
        }
        return sum + answer;
    }
}
