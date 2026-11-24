class ProductOfNumbers {
    List<Integer> ans;
    public ProductOfNumbers() {
        ans = new ArrayList<>();
    }
    
    public void add(int num) {
        ans.add(num);
    }
    
    public int getProduct(int k) {
        int n = ans.size();
        int p = 1;
        for(int i = n-k; i<n; i++){
            p*=ans.get(i);
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */