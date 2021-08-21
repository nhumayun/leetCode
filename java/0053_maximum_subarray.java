class Solution {
    public int maxSubArray(int[] nums) {

        int temp = 0;
        int min = Integer.MIN_VALUE;
        int max = 0;
        boolean gotMax = false;

        for (int i = 0; i < nums.length; i++) {

            if (temp + nums[i] < 0) {
                temp = 0;
            } else {
                gotMax = true;
                temp += nums[i];
            }


            if (temp > max) {
                max = temp;
            }

            if (nums[i] < 0) {
                if (nums[i] > min) {
                    min = nums[i];
                }
            }


        }
        
        return !gotMax ? min : max;
        
    }
}
