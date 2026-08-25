class Solution {
    public int largestInteger(int[] nums, int k) {
        
        int n = nums.length;
        
        // If k == n, there is only one subarray
        if (k == n) {
            int max = 0;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        
        // Count frequency of every number
        int[] count = new int[51];
        
        for (int num : nums) {
            count[num]++;
        }
        
        // If k == 1, only numbers appearing exactly once are valid
        if (k == 1) {
            int ans = -1;
            
            for (int num : nums) {
                if (count[num] == 1) {
                    ans = Math.max(ans, num);
                }
            }
            
            return ans;
        }
        
        // For 1 < k < n, only first and last elements can qualify
        int ans = -1;
        
        if (count[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }
        
        if (count[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }
        
        return ans;
    }
}