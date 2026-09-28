class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                ans.add(nums[i]);
            }
        }
        return ans;    
    }
}