class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> mp = new HashMap<>();
        for(String st : strs){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(st);
        }
        return new ArrayList<>(mp.values());
    }
}