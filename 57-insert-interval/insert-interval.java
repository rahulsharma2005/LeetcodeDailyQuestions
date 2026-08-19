class Solution {
    public int[][] insert(int[][] intervals, int[] i) {
        List<int[]> ans = new ArrayList<>();
        int i1 = 0;
        int n = intervals.length;
        while(i1 < n){
            if(intervals[i1][1] < i[0]){
                ans.add(intervals[i1]);
            }else if(intervals[i1][0] > i[1]){
                break;
            }else{
                i[0] = Math.min(i[0], intervals[i1][0]);
                i[1] = Math.max(i[1], intervals[i1][1]);
            }
            i1++;
        }
        
        ans.add(i);
        while (i1 < n) {
            ans.add(intervals[i1]);
            i1++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}