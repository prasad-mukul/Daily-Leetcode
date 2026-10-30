class Solution {
    public String longestPalindrome(String s) {
        int st=0;
        int m=0;
        for(int i=0;i<s.length(); i++){
            int l1=expand(s,i,i);
            int l2=expand(s,i,i+1);
            int len= Math.max(l1, l2);
            if(len > m){
                m=len;
                st=i-(len-1)/2;
            }
        }
        return s.substring(st, st+m);
    }
    private int expand(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}