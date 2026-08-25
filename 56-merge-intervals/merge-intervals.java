class Solution {
    public int[][] merge(int[][] intervals) {
       int n = intervals.length;
       Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
       List<int[]> ans = new ArrayList<>();
       ans.add(intervals[0]);
       for(int i = 1; i < n ; i++){
            int[] curr = intervals[i];
            int[] prev = ans.get(ans.size() - 1);
            if(prev[1] >= curr[0]){
                prev[1] = Math.max(curr[1],prev[1]);
            }else{
                ans.add(curr);
            }
       } 
       int[][] result = new int[ans.size()][];
       for(int i = 0 ; i < ans.size() ; i++){
        result[i] = ans.get(i);
       }
       return result;
    }
}