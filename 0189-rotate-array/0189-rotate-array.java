class Solution {

    static void swap(int a[] , int i ,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void reverse(int a[] ,int i ,int j){
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {

        int j=nums.length;
        k=k%j;

        reverse(nums,0,j-k-1);
        reverse(nums,j-k,j-1);
        reverse(nums,0,j-1);

    }
}