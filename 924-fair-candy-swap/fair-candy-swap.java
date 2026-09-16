class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        for(int a : aliceSizes){
            sumA += a;
        }
        for(int b : bobSizes){
            sumB += b;
        }
        int diff = (sumB - sumA) / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int b : bobSizes){
            set.add(b);
        }
        for(int a : aliceSizes){
            int req = a + diff;
            if(set.contains(req)){
                return new int[]{a, req};
            } 
        
        }
        return new int[]{};
    }
}