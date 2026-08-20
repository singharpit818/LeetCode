class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1= new ArrayList<>(); 
        ArrayList<Integer> arr2= new ArrayList<>(); 
        int ans[] = new int [n]; 
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int a1=1;
        int a2=1;

        for(int i = 2 ; i<n ; i++){
                if(arr1.get(a1-1)>arr2.get(a2-1)){
                    arr1.add(nums[i]);
                    a1++;
                }
                else{
                    arr2.add(nums[i]);
                    a2++;
                }
        }
        arr1.addAll(arr2);
        for (int i = 0; i < n; i++) {
            ans[i] = arr1.get(i);
        }
        return ans;
    }
}