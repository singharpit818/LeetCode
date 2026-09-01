class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = words.length;
        for(int i = 0 ; i<n ; i++){
        boolean y = false;
            for(int j = 0 ; j<words[i].length() ; j++){
                if(words[i].charAt(j)== x){
                     y = true;
                }
            }
                    if(y==true)  ans.add(i);

        }
        return ans;
    }
}