class ProductOfNumbers {
    ArrayList<Integer> st = new ArrayList<>();

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        st.add(num);
        
    }
    
    public int getProduct(int k) {
        int n = st.size();
        int p=1;
        while(k>0){
            p*=st.get(n-1);
            k--;
            n--;
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