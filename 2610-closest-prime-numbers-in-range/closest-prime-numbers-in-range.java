
class Solution {
    public int[] closestPrimes(int left, int right) {

        int[] ans = new int[]{-1, -1};
        List<Integer> pn = new ArrayList<>();

        boolean[] prime = new boolean[right + 1];
        for (int i = 2; i * i <= right; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = Math.max(2, left); i <= right; i++) {
            if (!prime[i]) {
                pn.add(i);
            }
        }
        int lt = 0;
        int min = Integer.MAX_VALUE;
        for (int rt = 1; rt < pn.size(); rt++) {
            if (pn.get(rt) - pn.get(lt) < min) {
                min = pn.get(rt) - pn.get(lt);
                ans[0] = pn.get(lt);
                ans[1] = pn.get(rt);
            }
            lt++;
        }

        return ans;
    }
}
