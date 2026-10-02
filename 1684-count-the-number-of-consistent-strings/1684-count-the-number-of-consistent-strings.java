class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        for(String word : words){
            boolean valid = true;
            for(char c : word.toCharArray()){
                if(!set.contains(c)){
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return  count;
    }
}