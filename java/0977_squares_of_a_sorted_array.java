class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int j = nums.length - 1;
        int i = 0;

        for (int z = j; z >= 0; z--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[z] = nums[i] * nums[i];
                i++;
            } else {
                result[z] = nums[j] * nums[j];
                j--;
            }
        }


        return result;

    }
}
