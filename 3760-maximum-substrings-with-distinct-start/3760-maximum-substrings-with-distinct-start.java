class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> map = new HashSet<>();
        for(char ch : s.toCharArray()){
            map.add(ch);
        }
    return map.size();
    }
}