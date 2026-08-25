class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int i = 0, j = n - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
        i = 0;
        j = k - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
        i = k;
        j = n-1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}