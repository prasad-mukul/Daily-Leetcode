class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int count = 0;
        while(num > 0){
            int d = num%10;
            sum += d;
            num/=10;
            count++;
        }
        if(count > 1){
            return addDigits(sum);
        }
        return sum;
    }
}