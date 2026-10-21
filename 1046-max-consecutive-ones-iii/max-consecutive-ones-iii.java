class Solution {
    public int longestOnes(int[] nums, int k) {
        int kc = k;
        int count = 0;
        int i = 0, j = 0;
        while(j < nums.length){
            if(nums[j] == 0 && kc >= 0){
                kc--;
            }
            while(kc < 0 && kc <= k){
                if(nums[i] == 0){
                    kc++;
                }
                i++;
            }
            count = Math.max(count, j-i+1);
            j++;
        }
        return count;
    }
}