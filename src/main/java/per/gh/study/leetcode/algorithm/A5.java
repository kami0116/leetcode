package per.gh.study.leetcode.algorithm;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class A5 {
    public static void main(String[] args) {
        A5 a5 = new A5();
        System.out.println(a5.longestPalindrome("ccc"));
    }

    public String longestPalindrome(String s) {
        byte[] bytes = s.getBytes();
        int max = 0;
        int start = -1, end = -1;
        for (int i = 1; i < bytes.length - 1; i++) {
            int m = 1;
            int j=1;
            for (; i - j >= 0 && i + j < bytes.length; j++) {
                if (bytes[i - j] == bytes[i + j]) {
                    m += 2;
                }else {
                    break;
                }
            }
            if (max < m) {
                max = m;
                start = i - j + 1;
                end = i + j - 1;
            }
        }
        for (int i = 0; i < bytes.length - 1; i++) {
            int m = 0;
            int j = 0;
            for (; i - j >= 0 && i + 1 + j < bytes.length; j++) {
                if (bytes[i - j] == bytes[i + 1 + j]) {
                    m += 2;
                }else {
                    break;
                }
            }
            if (max < m) {
                max = m;
                start = i - j + 1;
                end = i + j;
            }
        }

        return max > 1 ? s.subSequence(start, end + 1).toString() : s.subSequence(0, 1).toString();
    }

}
