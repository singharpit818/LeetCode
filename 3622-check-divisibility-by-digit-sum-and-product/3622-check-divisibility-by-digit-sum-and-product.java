class Solution {
    public boolean checkDivisibility(int n) {
        boolean ans = false;
        int sum = 0;
        int pro = 1;
        int num = n;
        // if(n<10)return false;
        while(num!=0){

            int rem = num%10;
            sum+=rem;
            pro*=rem;
            num/=10;
        }
        if(n%(sum+pro)==0){
            return true;
        }
        return false;

    }
}