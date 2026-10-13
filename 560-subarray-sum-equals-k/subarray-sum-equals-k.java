class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        mp.put(0,1);
        int psum = 0;
        for(int i = 0; i < nums.length ; i++){
            psum += nums[i];
            if(mp.containsKey(psum - k)){
                count += mp.get(psum - k);
            }
            mp.put(psum,mp.getOrDefault(psum,0)+1);
        }
        return count;
    }
}