package Day23;

import java.util.*;

public class LC904 {

    static class Solution {

        public int totalFruit(int[] fruits) {

            Map<Integer, Integer> map = new HashMap<>();

            int left = 0;
            int ans = 0;

            for (int right = 0; right < fruits.length; right++) {

                map.put(fruits[right],
                        map.getOrDefault(fruits[right], 0) + 1);

                while (map.size() > 2) {

                    map.put(fruits[left],
                            map.get(fruits[left]) - 1);

                    if (map.get(fruits[left]) == 0)
                        map.remove(fruits[left]);

                    left++;
                }

                ans = Math.max(ans, right - left + 1);
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] fruits = {1, 2, 1};

        System.out.println(obj.totalFruit(fruits));
    }
}