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

        int result = 0;
        int pointer = 0;
        int temp = 0;
        while(pointer < s.length()) {
            if(pointer == 0) {
                temp += map.get(s.charAt(pointer++));
                continue;
            }
            if(map.get(s.charAt(pointer)) > map.get(s.charAt(pointer-1))) {
                result += (map.get(s.charAt(pointer))-map.get(s.charAt(pointer-1)));
                temp = 0;
            } else {
                result += temp;
                temp = map.get(s.charAt(pointer));
            }
            pointer++;
        }
        return result+temp;
    }
}