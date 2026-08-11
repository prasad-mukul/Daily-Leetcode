class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n : nums){
            st.add(n);
        }
        int sum = nums[0];
        for(int j=1; j< nums.length; j++){
            if(nums[j] == nums[j-1] + 1){
                sum+= nums[j];
            }else{
                break;  
            }
        }
        while(st.contains(sum)){
            sum++;
        }
        return sum;
    }
}