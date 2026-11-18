class Solution {
    public int minChanges(String s) {
        int c = 0;
        // int m = 0;
        int n = s.length();
        for(int i = 0 ; i<n-1 ; i+=2){
            if(s.charAt(i)!=s.charAt(i+1))
                c++;
        }
      return c;
    }
}