class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            String s = "";
            if(i%3 == 0){
                s+="Fizz";
            }
            if(i%5 == 0){
                s+="Buzz";
            }
            if(s.isEmpty()){
                s+=i;
            }
            res.add(s);
        } 
        return res;
    }
}