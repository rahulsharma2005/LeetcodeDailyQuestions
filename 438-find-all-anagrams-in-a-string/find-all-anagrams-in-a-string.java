
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[26];
        for (char c : p.toCharArray()) {
            freq[c - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']--;

            if (right - left + 1 > p.length()) {
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == p.length() && allZero(freq)) {
                ans.add(left);
            }
        }

        return ans;
    }
    private boolean allZero(int[] freq) {
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
