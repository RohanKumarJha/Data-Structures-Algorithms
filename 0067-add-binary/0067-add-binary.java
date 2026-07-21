class Solution {
    public String addBinary(String a, String b) {
        int pointer1=a.length()-1, pointer2=b.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(pointer1>=0 && pointer2>=0) {
            int sum = (a.charAt(pointer1)-'0') + (b.charAt(pointer2)-'0') + carry;
            int num = sum % 2;
            carry = sum/2;
            char ch = (char) (num + '0');
            sb.append(ch);
            pointer1--;
            pointer2--;
        }
        while(pointer1 >= 0) {
            int sum = (a.charAt(pointer1)-'0') + carry;
            int num = sum % 2;
            carry = sum/2;
            char ch = (char) (num + '0');
            sb.append(ch);
            pointer1--;
        }
        while(pointer2 >= 0) {
            int sum = (b.charAt(pointer2)-'0') + carry;
            int num = sum % 2;
            carry = sum/2;
            char ch = (char) (num + '0');
            sb.append(ch);
            pointer2--;
        }
        if(carry == 1) {
            char ch = (char) (carry + '0');
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}