package per.gh.study.leetcode.algorithm;

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 * <p>
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 * <p>
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * 示例 3：
 * <p>
 * 输入：nums1 = [0,0], nums2 = [0,0]
 * 输出：0.00000
 * 示例 4：
 * <p>
 * 输入：nums1 = [], nums2 = [1]
 * 输出：1.00000
 * 示例 5：
 * <p>
 * 输入：nums1 = [2], nums2 = []
 * 输出：2.00000
 * 提示：
 * <p>
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class A4 {
    public static void main(String[] args) {
        A4 a4 = new A4();
        System.out.println(a4.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int targetIndex1 = (nums1.length + nums2.length - 1) / 2;
        int targetIndex2 = (nums1.length + nums2.length) / 2;
        int i = 0, j = 0;
        Integer r1 = null, r2 = null;
        while (i + j - 1 != targetIndex2 && i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                r1 = r2;
                r2 = nums1[i++];
            } else {
                r1 = r2;
                r2 = nums2[j++];
            }
        }
        if (i + j - 1 != targetIndex2) {
            if (i < nums1.length) {
                while (i + j - 1 != targetIndex2) {
                    r1 = r2;
                    r2 = nums1[i++];
                }
            } else {
                while (i + j - 1 != targetIndex2) {
                    r1 = r2;
                    r2 = nums2[j++];
                }
            }
        }
        return targetIndex1==targetIndex2?r2:(r1+r2)/2.0;

    }
}
