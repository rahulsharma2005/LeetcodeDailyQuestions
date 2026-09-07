class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int count = 0,ans = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] % 2 == 1) count++;

            if(mp.containsKey(count - k)){
                ans += mp.get(count - k); 
            }
            mp.put(count,mp.getOrDefault(count,0)+1);
        }
        return ans;
    }
}