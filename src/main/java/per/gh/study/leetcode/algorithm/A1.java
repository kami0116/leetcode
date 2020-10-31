package per.gh.study.leetcode.algorithm;

public class A1 {
    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i!=j) {
                    r[0] = i;
                    r[1] = j;
                }
            }
        }
        return r;
    }
}
