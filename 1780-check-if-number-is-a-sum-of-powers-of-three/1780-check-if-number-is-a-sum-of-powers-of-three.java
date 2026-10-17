class Solution {
    public boolean checkPowersOfThree(int n) {
        int c = 0;
        int sum = 1;
        while(n>=sum){
            sum*=3;
            c++;
        }
        c-=1;
        int ans = 0;
        while(c>=0){
            int po = (int)Math.pow(3,c);
            if(n>=po){
                n-=(int)Math.pow(3,c);
            }
                c--;
            
        }
        if(n==0)return true;
        return false;
        
        
    }
}