package per.gh.study.leetcode.algorithm;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class A3 {
    public static void main(String[] args) {
        A3 a3 = new A3();
//        System.out.println(a3.lengthOfLongestSubstring(""));
//        System.out.println(a3.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(a3.lengthOfLongestSubstring("bbbbb"));
//        System.out.println(a3.lengthOfLongestSubstring("pwwkew"));
        System.out.println(a3.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        byte[] bytes = s.getBytes();
        int end = 0, start = 0, index = -1;
        for (; end < bytes.length; end++) {
            if ((index = index(bytes[end], bytes, start, end)) != -1) {
                if (end - start > max) {
                    max = end - start;
                }
                start = index + 1;
            }
        }
        if (end - start > max) {
            max = end - start;
        }
        return max;
    }

    public int index(byte b, byte[] bytes, int start, int end) {
        for (int i = start; i < end; i++) {
            if (bytes[i] == b)
                return i;
        }
        return -1;
    }
}
