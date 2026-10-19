class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int max = 0;
        int i = 0;
        for(int j = 0; j < s.length();j++){
            char ch = s.charAt(j);
            while(st.contains(ch)){
                st.remove(s.charAt(i));
                i++; 
            }
            st.add(ch);
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}