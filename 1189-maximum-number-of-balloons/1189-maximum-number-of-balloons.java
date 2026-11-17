class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c :text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        // int x = map.get('l')/2;
        // int y = map.get

       int z = Math.min(Math.min(map.getOrDefault('a', 0), map.getOrDefault('b', 0)), map.getOrDefault('n', 0));
       return Math.min(z,Math.min(map.getOrDefault('l',0)/2,map.getOrDefault('o',0)/2));

    //     if(map.get('a').equals(map.get('b'))
    // && map.get('b').equals(map.get('n')))
        
    }
}