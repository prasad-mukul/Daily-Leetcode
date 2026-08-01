class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n= nums.length;
        int diff= solve(nums, 0, n-1);
        return diff >= 0;   
    }
    private int solve(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }
        int pickLeft = nums[left] - solve(nums, left+1, right);
        int pickRight = nums[right] - solve(nums, left, right-1);

        return Math.max(pickLeft, pickRight);

    }
}