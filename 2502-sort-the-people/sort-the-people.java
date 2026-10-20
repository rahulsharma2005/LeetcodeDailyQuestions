class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> mp = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0 ; i < names.length;i++){
            mp.put(heights[i],names[i]);
        }
        String[] ans = mp.values().toArray(new String[0]);
        return ans;
    }
}