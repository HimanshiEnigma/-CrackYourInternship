class Solution {
    public int subarraysDivByK(int[] nums, int k) {
                var mods  = new int[k];
        int m     = 0;
        int count = 0;

        mods[0] = 1;

        for (int num: nums) {
            m = Math.floorMod(m + num, k);
            count += mods[m];
            mods[m] += 1;
        }
        return count;
    }
}
