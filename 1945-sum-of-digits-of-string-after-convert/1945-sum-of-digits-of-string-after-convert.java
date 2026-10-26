class Solution {
    public int getLucky(String s, int k) {
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(ch - 'a' + 1);
        }
        int n = sb.length();
        for(int i = 0 ; i<n ; i++){
            int su = sb.charAt(i) - '0';
            ans+=su;
        }
        for(int i = 1 ; i<k ; i++){
            int sum = 0;
            while(ans!=0){
                int rem = ans%10;
                sum+=rem;
                ans/=10;
            }
            ans=sum;
        }
        return ans;
       
    }
}