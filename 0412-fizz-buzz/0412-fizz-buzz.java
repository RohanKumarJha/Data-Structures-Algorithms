class Solution {
    private String applyCondition(int n) {
        if(n%3==0 && n%5==0) {
            return "FizzBuzz";
        } else if(n%3==0) {
            return "Fizz";
        } else if(n%5==0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            String result = applyCondition(i);
            list.add(result);
        }
        return list;
    }
}