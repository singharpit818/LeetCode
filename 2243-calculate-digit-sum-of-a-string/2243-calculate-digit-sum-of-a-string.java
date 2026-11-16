class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k) return s;
        while(s.length()>k){
        String m = "";
        int x = 0;
        for(int i = 0 ; i<s.length() ; i++){
            x+=s.charAt(i)-'0';
            if((i+1)%k==0){
                m+=x;
                x=0;
            }

        }
        if(s.length()%k!=0)m+=x;
        s=m;
        }
        

    return s;
        
    }
}