class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && c == st.peek()){
                st.pop();
            }else st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}