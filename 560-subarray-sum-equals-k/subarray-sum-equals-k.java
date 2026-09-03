class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0, total = 0;
        mp.put(0,1);
        for(int num : nums){
            total += num;
            if(mp.containsKey(total-k)){
                count+= mp.get(total-k);
            }
            mp.put(total,mp.getOrDefault(total,0)+1);
        }
        return count;
    }
}