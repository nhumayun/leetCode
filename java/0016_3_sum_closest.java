class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > target) {
                    if (Math.abs(sum - target) < diff) {
                        diff = Math.abs(sum - target);
                        totalSum = sum;
                    }
                    k--;
                } else if (sum < target) {
                    if (Math.abs(sum - target) < diff) {
                        diff = Math.abs(sum - target);
                        totalSum = sum;
                    }
                    j++;
                } else {
                    return (nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        return totalSum;
        
    }
}
