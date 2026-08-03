class Solution {
    public int[] separateDigits(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        for(int n : nums){
            List<Integer> temp = new ArrayList<>();
            while( n > 0){
                temp.add(n % 10);
                n /= 10;
            }
            for(int i =temp.size() -1; i>=0; i--){
                ans.add(temp.get(i));
            }
        }
        int[] res = new int[ans.size()];
        for(int i=0; i< ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}