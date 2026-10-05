class Solution {
    public int sumOfUnique(int[] nums) {
       Set<Integer> set = new HashSet<>();
       Set<Integer> dup = new HashSet<>();
       for(int n : nums){
        if(set.contains(n)){
            dup.add(n);
        }
        else{
            set.add(n);
        }
       }
       int sum = 0;
       for(int ns : set){
        if(!dup.contains(ns)){
            sum += ns;
        }
       }
       return sum; 
    }
}