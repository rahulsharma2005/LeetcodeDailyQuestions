class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int count = 0 ,  sum = 0;
        mp.put(0,1);
        for(int num : nums){
            sum += num;
            if(mp.containsKey(sum - goal)){
                count+= mp.get(sum - goal);
            }
            mp.put(sum, mp.getOrDefault(sum , 0)+1);
        }
        return count;
    }
}