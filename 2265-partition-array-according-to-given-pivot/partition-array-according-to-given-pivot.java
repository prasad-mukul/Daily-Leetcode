class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int index = 0;

        // First: smaller than pivot
        for (int num : nums) {
            if (num < pivot) {
                ans[index++] = num;
            }
        }

        // Second: equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                ans[index++] = num;
            }
        }

        // Third: greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}