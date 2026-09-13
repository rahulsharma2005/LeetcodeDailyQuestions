class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '#') {
                if(!a.isEmpty()) a.pop();
            } else {
                a.push(c);
            }
        }

        for(char c : t.toCharArray()) {
            if(c == '#') {
                if(!b.isEmpty()) b.pop();
            } else {
                b.push(c);
            }
        }

        return a.equals(b);
    }
}