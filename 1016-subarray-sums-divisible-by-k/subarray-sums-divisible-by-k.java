class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0, sum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i = 0; i < n ; i++){
            sum += nums[i];
            int rem = sum % k;
            if(rem < 0){
                rem += k;
            }
            if(mp.containsKey(rem)){
                count += mp.get(rem);
                mp.put(rem,mp.get(rem)+1);
            }else mp.put(rem,1);
        }
        return count;
    }
}