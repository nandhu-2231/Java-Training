package Day25;

public class LC162 {

    static class Solution {

        public int findPeakElement(int[] nums) {

            int left = 0;
            int right = nums.length - 1;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (nums[mid] > nums[mid + 1])
                    right = mid;
                else
                    left = mid + 1;
            }

            return left;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1,2,3,1};

        System.out.println(obj.findPeakElement(nums));
    }
}