class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int val : nums) {
            if (val == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count >= max) {
                max = count;
            }
        }

        return max;

    }
}
