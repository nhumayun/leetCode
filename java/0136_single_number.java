class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        Set<Integer> hashSet = new HashSet<>();

        for (Integer i : nums)
            if (!hashSet.add(i))
                hashSet.remove(i);

        for (Integer i : hashSet)
            ans = i;

        return ans;

    }
}
