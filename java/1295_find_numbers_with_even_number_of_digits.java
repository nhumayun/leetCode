class Solution {
    public int findNumbers(int[] nums) {

        int res = 0;

        for (int val : nums) {
            int digit = 1;
            while (val >= 10) {
                digit++;
                val = val / 10;
            }

            if (digit % 2 == 0) {
                res++;
            }

        }

        return res;

    }
}
