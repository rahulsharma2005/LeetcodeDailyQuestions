/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
            n++;
            temp = temp.next;
        }
        int[] ans = new int[n];
        ListNode v = head;
        int j = 0;
        while(v != null){
            ans[j] = v.val;
            v = v.next;
            j++;
        }
        Stack<Integer> st = new Stack<>();
        int[] ans1 = new int[n];
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && ans[i] > ans[st.peek()]){
                int idx = st.pop();
                ans1[idx] = ans[i];
            }
            st.push(i);
        } 
        return ans1;
    }
}