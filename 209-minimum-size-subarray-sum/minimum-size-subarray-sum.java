class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int count = Integer.MAX_VALUE;
        int sum = 0;
        while(j < n){
            sum += nums[j];
            while(sum >= target){
                count = Math.min(count, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if(count == Integer.MAX_VALUE) return 0;
        return count;
    }
}