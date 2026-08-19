class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while(k != 0){
            nums[i] *= -1;
            if(i < nums.length - 1 && nums[i] > nums[i+1]) i++;
            k--;
        }
        return Arrays.stream(nums).sum();
    }
}