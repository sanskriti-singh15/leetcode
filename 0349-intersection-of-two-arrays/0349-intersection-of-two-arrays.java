import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // nums1 ke elements set mein daalo
        for (int num : nums1) {
            set.add(num);
        }

        // nums2 ke common elements find karo
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Set ko array mein convert karo
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}