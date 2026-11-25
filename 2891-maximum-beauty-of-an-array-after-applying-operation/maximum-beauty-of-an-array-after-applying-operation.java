class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int freq=0;
        for(int j=0; j<nums.length; j++){
            while(i<j && nums[i]+k<nums[j]-k){
                i++;
            }
            freq=Math.max(freq, j-i+1);
        }
        return freq;
    }
}