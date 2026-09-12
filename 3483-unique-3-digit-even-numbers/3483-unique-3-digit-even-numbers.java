class Solution {
    public int totalNumbers(int[] d) {
        int n = d.length;
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0 ; i<n ; i++){
            if(d[i]==0) continue;
            for(int j = 0 ; j<n ; j++){
                if(i==j) continue;
                for(int k = 0 ; k<n ; k++){
                    if(i==k || j==k) continue;
                    if(d[k]%2==0){
                        int ans = d[i]*100 + d[j]*10 + d[k];
                    set.add(ans);
                    }
                }
            }
        }
        return set.size();
    }
}