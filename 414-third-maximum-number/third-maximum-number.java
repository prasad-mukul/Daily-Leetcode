class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        if(set.size() < 3){
            return Collections.max(set);
        }
        int first = Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int n : set){
            if(n> first){
                third = second;
                second = first;
                first = n;
            }
            else if(n> second){
                third = second;
                second = n;
            }
            else if(n > third){
                third = n;
            }
        }
        return third;
    }
}