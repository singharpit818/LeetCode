class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        // boolean ans = true;
        if(s.length()==t.length()){
        for(int i = 0 ; i<s.length() ; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        // for(char ch : s.toCharArray()){
        //     arr[ch-'a']++;
        // }
        // for(char ch : t.toCharArray()){
        //     arr[ch - 'a']--;
        // }
        for(int i = 0 ; i<26 ; i++){
            if(arr[i]!=0) return false;
            // else ans=false;
        }
       return true; 
        }
        return false;
    }
}