class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int arr[] = new int[n];
        arr[n-2]=nums[n-1];
        // int i = 0;
        for(int i = 0 ; i<n-1 ; i++){
            if(i%2==0){
                arr[i+1]=nums[i];
            }
            else{
                arr[i-1]=nums[i];
            }
        }
        // int m1 = Integer.MAX_VALUE;
        // int m2 = Integer.MAX_VALUE;
        // for(int i = 0 ; i<n ; i++){
        return arr;
        }
    }
