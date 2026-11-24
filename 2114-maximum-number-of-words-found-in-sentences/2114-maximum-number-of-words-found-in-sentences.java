class Solution {
    public int mostWordsFound(String[] s) {
        int n = s.length;
        int max = 0;
        for(int i = 0 ; i<n ; i++){
        int c=0;
        // String str = s[i];
        for(int j = 0 ; j<s[i].length() ; j++){
            if(s[i].charAt(j)==' '){
                c++;
            }
        }
        c++;
        max=Math.max(c,max);
        }
        return max;
    }
}