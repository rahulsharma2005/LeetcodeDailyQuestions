class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int left = target - nums[i];
            if(mp.containsKey(left)){
                return new int[]{mp.get(left),i};
            }
            mp.put(nums[i],i);
        }
        return nums;
    }
}