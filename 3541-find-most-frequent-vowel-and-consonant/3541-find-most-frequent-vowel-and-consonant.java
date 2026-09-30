class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        int maxVowel = 0;
        int maxConsonant = 0;

for (Map.Entry<Character, Integer> entry : map.entrySet()) {

    char c = entry.getKey();
    int count = entry.getValue();

    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        maxVowel = Math.max(maxVowel, count);
    } else {
        maxConsonant = Math.max(maxConsonant, count);
    }
}
       return maxVowel+maxConsonant; 
    }
}