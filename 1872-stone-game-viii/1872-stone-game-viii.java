class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;

        // Prefix sum
        int[] prefix = new int[n];
        prefix[0] = stones[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + stones[i];
        }

        // Start with taking all stones
        int best = prefix[n - 1];

        // Try all valid prefix choices from right to left
        for (int i = n - 2; i >= 1; i--) {
            best = Math.max(best, prefix[i] - best);
        }

        return best;
    }
}