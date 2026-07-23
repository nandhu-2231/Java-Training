package Day22;
public class LC374 {

    static class Solution {

        private int pick = 6;

        private int guess(int num) {
            if (num == pick)
                return 0;
            if (num > pick)
                return -1;
            return 1;
        }

        public int guessNumber(int n) {

            int left = 1;
            int right = n;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                int result = guess(mid);

                if (result == 0)
                    return mid;
                else if (result < 0)
                    right = mid - 1;
                else
                    left = mid + 1;
            }

            return -1;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.guessNumber(10));
    }
}

