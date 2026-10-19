class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList <Integer> l1 = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]==target){
                l1.add(i);
            }
        }
        return l1;
    }
}