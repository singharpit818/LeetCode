class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        ArrayList <Integer> l1 = new ArrayList<>();
        int n = nums.length;
        int less=0;
        int same=0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]<target){
                less++;
            }
            if(nums[i]==target){
                same++;
            }
        }
        for(int i=0 ; i<same ; i++){
            l1.add(less+i);
        }
        return l1;
    }
}