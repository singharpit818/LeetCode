class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int a:nums1)s1.add(a);
        for(int i:nums2)s2.add(i);

        s1.retainAll(s2);
        int []ans =  new int[s1.size()]; 
        int i=0;
        for(int s :s1){
            ans[i]=s;
            i++;

        }    
        return ans;
    }
}