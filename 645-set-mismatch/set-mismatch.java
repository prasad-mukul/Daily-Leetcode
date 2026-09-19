class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] set = new int[n+1];
        for(int x: nums){
            set[x]++;
        }
        int duplicate = 0;
        int missing = 0;
        for(int i=0; i<=n; i++){
            if(set[i] == 2) duplicate = i;
            if(set[i] == 0) missing = i;
        }
        return new int[]{duplicate, missing};
    }
}