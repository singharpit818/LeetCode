class Solution {
    public int pivotInteger(int n) {
        int a[] = new int[n];
        int p[] = new int[n];
        a[0]=1;
        p[n-1]=n;
        for(int i = 1 ; i<n ; i++){
            a[i]=a[i-1]+(i+1);
            p[n-i-1]=p[n-i]+(n-i);
        }
        for(int i = 0 ; i<n ; i++){
            if(a[i]==p[i]){
                return i+1;
            }
        }
        return -1;       
    }
}