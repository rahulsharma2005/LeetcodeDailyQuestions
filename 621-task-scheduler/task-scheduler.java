class Solution {
    public int leastInterval(char[] tasks, int p) {
        int n = tasks.length;
        int[] counter = new int[26];
        for (char ch : tasks) {
            counter[ch - 'A']++;
        }
        Arrays.sort(counter);
        int chunks = counter[25] - 1;
        int idolSpots = chunks * p;
        for (int i = 24; i >= 0; i--) {
            idolSpots -= Math.min(chunks, counter[i]);
        }
        if (idolSpots > 0)
            return n + idolSpots;

        return n;
    }
}