class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        // int[] even = new int[(n/2)+1];
        for(int i = 0 ; i<n ; i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        // Arrays.sort(odd,Collections.reverseOrder());
        int c=0;
        int k=odd.size();
        for(int  i = 0 ; i<n ;  i++){
            if(i%2==0){
                nums[i]=even.get(c);
                c++;
            }
            else{
                nums[i]=odd.get(k-1);
                k--;
            }
        }
return nums;
    }
}