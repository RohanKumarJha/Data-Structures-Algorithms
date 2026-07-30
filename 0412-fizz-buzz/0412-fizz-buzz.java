class Solution {
    private List<String> check(int n,List<String> list) {
        if(n%5==0 && n%3==0) {
            list.add("FizzBuzz");
        } else if(n%3==0) {
            list.add("Fizz");
        } else if(n%5==0) {
            list.add("Buzz");
        } else {
            list.add(String.valueOf(n));
        }
        return list;
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            check(i,list);
        }
        return list;
    }
}