class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        HashSet<Integer> st = new HashSet<>();
        int max = 1;
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }
        for (int i : st) {
            if (!st.contains(i - 1)) {
                int count = 1;
                int p = i;
                while (st.contains(p + 1)) {
                    count++;
                    p++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}