class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        double sum = 0;
        double msum = Integer.MIN_VALUE;
        int i = 0,j=0;
        while(j < nums.length){
            sum+=nums[j];
            if(j-i+1 == k){
                msum = Math.max(sum,msum);
                sum -= nums[i];
                j++;
                i++;
            }else if(j-i + 1 < k){
                j++;
            }
        }
        return msum/k;

    }
}