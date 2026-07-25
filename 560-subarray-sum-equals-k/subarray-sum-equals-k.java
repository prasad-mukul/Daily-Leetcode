/*
class Solution {
    public int subarraySum(int[] nums, int k) {
     *
        int c = 0;
       int sum=0; 
     for(int i=0;i<nums.length;i++)
     {
      sum+=nums[i];  
          }  l =0, r=nums .length -1;
   while(l<=r)
   {
       if(sum==k)
       {
           c++
           l++; ; 
       
       else if(sum>k)
       {
           sum-=nums[r]; 
           r--; 
       
       else
       
           sum-=nums[l]; {
           l++; 
        }   }
   ret         */ 
// } } 
//     }  
// ---------------------------------------------------------------------------
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j = i; j<nums.length; j++){
                sum += nums[j];
                if(sum == k) count++;
            }
        }
        return count;
    }
}