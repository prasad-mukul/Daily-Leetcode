class Solution {
    public int countValidPrefixes(String s) {
        int count= 0, c= 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '0'){
                c++;
            }else{
                c--;
            }
            if(Math.abs(c) <= 1){
                count++;
            }
        }
        return count++;
    }
}