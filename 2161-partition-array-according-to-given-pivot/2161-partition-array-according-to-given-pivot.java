class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();

        int n = nums.length;
        int[]ans = new int[n]; 
        for(int i = 0 ; i<n ; i++){
            if(nums[i]<pivot){
                s.add(nums[i]);
            }
            if(nums[i]>pivot){
                l.add(nums[i]);
            }   
        }
        
        for(int i = 0 ; i<n ; i++){
            if(nums[i]==pivot){
            s.add(pivot);
                }
        }
            s.addAll(l);    
        for(int i = 0 ; i<n ; i++){

            ans[i]=s.get(i);
        }
        return ans;
    }
}