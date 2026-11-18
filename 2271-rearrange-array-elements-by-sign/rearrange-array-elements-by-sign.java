class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi =0;
        int ni=1;
        int[] ans = new int[nums.length];
        for(int n:nums){
            if(n>0){
                ans[pi]=n;
                pi=pi+2;
            }else{
                ans[ni]=n;
                ni+=2;
            }
        }
        return ans;
    }
}