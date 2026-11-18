class Solution {
    public int calculate(String s) {
        int l = s.length();
        Stack<Integer> st = new Stack<>();
        int sign = 1;
        int currNo = 0;
        int ans = 0;
        for(int i=0; i<l; i++){
            if(Character.isDigit(s.charAt(i))){
                currNo = s.charAt(i)-'0';
                while(i+1<l && Character.isDigit(s.charAt(i+1))){
                    i++;
                    currNo = currNo*10 + s.charAt(i)-'0';
                }
                currNo = currNo*sign;
                ans+=currNo;
                currNo=0;
            }
            else if(s.charAt(i) == '+'){
                sign = 1;
            }
            else if(s.charAt(i) == '-'){
                sign = -1;
            }
            else if(s.charAt(i) == '('){
                st.push(ans);
                st.push(sign);
                ans=0;
                sign=1;
            }
            else if(s.charAt(i) == ')'){
                int preSign = st.pop();
                ans=preSign*ans;
                int preAns = st.pop();
                ans=ans+preAns;
            }
        }
        return ans;
    }
}