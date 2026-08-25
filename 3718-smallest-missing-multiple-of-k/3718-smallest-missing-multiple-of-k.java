class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int a:nums) set.add(a);
        int ans = 0;
        for(int i = 1 ; i<200 ; i++){
            ans = k*i;
            if(!set.contains(ans)){
                return ans;
            }
        }
        return -1;
    }
}