class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i<k && i<str.length){
            sb.append(str[i]+" ");
            i++;
        }
        String ns = String.valueOf(sb);
        ns=ns.trim();
        return ns;
    }
}