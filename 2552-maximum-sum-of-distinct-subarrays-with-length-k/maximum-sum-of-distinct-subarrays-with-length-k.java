class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        long sum = 0;
        long maxSum = 0;
        Set<Integer> st = new HashSet<>();
        for (int right = 0; right < n; right++) {
            while (st.contains(nums[right])) {
                st.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            st.add(nums[right]);
            sum += nums[right];
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                st.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}