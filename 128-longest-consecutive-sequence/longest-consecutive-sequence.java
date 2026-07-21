class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for (int n : nums){
            store.add(n);
        }
        int longest = 0;
        for(int n: store){
            if(!store.contains(n-1)){
                int curr = n;
                int len = 1;
                while(store.contains(curr+1)){
                    curr++;
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}