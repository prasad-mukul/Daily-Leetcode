class Solution {
    private boolean isVowel(char c){
        if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'){
            return true;
        }
        return false;
    }
    public int maxFreqSum(String s) {
        int[] hash = new int[26];
        int maxV = 0;
        int maxC = 0;
        for(char ch : s.toCharArray()){
            int i = ch - 'a';
            hash[i]++;
            if(isVowel(ch)){
                maxV = Math.max(maxV, hash[i]);
            }else{
                maxC = Math.max(maxC, hash[i]);
            }
        }
        return maxV + maxC;
    }
}