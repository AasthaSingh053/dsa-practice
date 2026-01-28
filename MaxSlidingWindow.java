import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) return new int[0];
        int n = nums.length;
        if (k == 1) return nums.clone();

        Deque<Integer> de = new LinkedList<>();
        int outLen = n - k + 1;
        int[] result = new int[outLen];
        int ri = 0;

        // build initial window (indices 0..k-1)
        for (int i = 0; i < k; i++) {
            while (!de.isEmpty() && nums[de.peekLast()] < nums[i]) {
                de.removeLast();
            }
            de.offerLast(i);
        }
        result[ri++] = nums[de.peekFirst()];

        // slide the window
        for (int j = k; j < n; j++) {
            int start = j - k + 1;

            // remove indices out of the current window
            while (!de.isEmpty() && de.peekFirst() < start) {
                de.removeFirst();
            }

            // maintain decreasing order in deque
            while (!de.isEmpty() && nums[de.peekLast()] < nums[j]) {
                de.removeLast();
            }
            de.offerLast(j);

            // current max
            result[ri++] = nums[de.peekFirst()];
        }

        return result;
    }
}
class MaxSlidingWindow{
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        Solution obj = new Solution();
        int[] ans = obj.maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(ans));
    }
}