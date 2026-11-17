class Solution {
    public int numSub(String s) {
        long res=0;
        int n=s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                long count = 0;
                while(i<n && s.charAt(i) == '1'){
                    count++;
                    i++;
                }
                res=(res+(count*(count+1))/2) % 1000000007;
            }
        }
        return (int)res;
    }
}