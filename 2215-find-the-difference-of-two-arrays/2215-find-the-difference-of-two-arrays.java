class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int num:nums1){
            s1.add(num);
        }
        for(int num : nums2){
            s2.add(num);
        }
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        for(int num : s1){
            if(!s2.contains(num)){
                r1.add(num);
            }
        }
        for(int num : s2){
            if(!s1.contains(num)){
                r2.add(num);
            }
        }
    
    list.add(r1);
    list.add(r2);
    return list;
        
    }
}