package Day23;

public class LC1493 {

    static class Solution {

        public int longestSubarray(int[] nums) {

            int left = 0;
            int zero = 0;
            int ans = 0;

            for (int right = 0; right < nums.length; right++) {

                if (nums[right] == 0)
                    zero++;

                while (zero > 1) {

                    if (nums[left] == 0)
                        zero--;

                    left++;
                }

                ans = Math.max(ans, right - left);
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 1, 0, 1};

        System.out.println(obj.longestSubarray(nums));
    }
}