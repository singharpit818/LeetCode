class Solution {
    public int totalMoney(int n) {
        int x = 7;
        int k = 0;
        int ans = 0;
        int mod = n%7;
        int div = n/7;
        while(div!=0){
            ans+=((x*(x+1))/2 - (k*(k+1))/2);
            k++;
            x++;
            div--;
        }
        k+=1;
        while(mod!=0){
            ans+=k;
            k++;
            mod--;
        }
        return ans;
    }
}