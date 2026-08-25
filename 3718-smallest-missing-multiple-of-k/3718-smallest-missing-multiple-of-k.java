class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        
        // Store all numbers of nums
        for (int num : nums) {
            set.add(num);
        }
        
        // Check k, 2k, 3k, 4k...
        int multiple = k;
        
        while (set.contains(multiple)) {
            multiple += k;
        }
        
        return multiple;
    }
}