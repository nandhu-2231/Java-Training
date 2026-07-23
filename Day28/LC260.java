package Day28;

public class LC260 {

    static class Solution {

        public int[] singleNumber(int[] nums) {

            int xor = 0;

            for (int num : nums) {
                xor ^= num;
            }

            int diff = xor & (-xor);

            int a = 0;
            int b = 0;

            for (int num : nums) {

                if ((num & diff) == 0)
                    a ^= num;
                else
                    b ^= num;
            }

            return new int[]{a, b};
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 1, 3, 2, 5};

        int[] ans = obj.singleNumber(nums);

        System.out.println(ans[0] + " " + ans[1]);
    }
}