package per.gh.study.leetcode.algorithm;

import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * <p>
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 * <p>
 *  
 * 示例 1：
 * <p>
 * 输入：s = "aa" p = "a"
 * 输出：false
 * 解释："a" 无法匹配 "aa" 整个字符串。
 * 示例 2:
 * <p>
 * 输入：s = "aa" p = "a*"
 * 输出：true
 * 解释：因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。
 * 示例 3：
 * <p>
 * 输入：s = "ab" p = ".*"
 * 输出：true
 * 解释：".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。
 * 示例 4：
 * <p>
 * 输入：s = "aab" p = "c*a*b"
 * 输出：true
 * 解释：因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 * 示例 5：
 * <p>
 * 输入：s = "mississippi" p = "mis*is*p*."
 * 输出：false
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 20
 * 0 <= p.length <= 30
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 * 保证每次出现字符 * 时，前面都匹配到有效的字符
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/regular-expression-matching
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class A10 {
    public static void main(String[] args) {
        A10 a10 = new A10();
        System.out.println(a10.isMatch("aaa", "a.a"));
        System.out.println(a10.isMatch("mississippi", "mis*is*p*."));
        System.out.println(a10.isMatch("aab", "c*a*b"));
    }

    byte[] ps;
    byte[] ss;
    boolean[][] flags;

    public boolean isMatch(String s, String p) {
        ss = ("!" + s).getBytes();
        ps = ("!" + p).getBytes();
        flags = new boolean[ss.length][ps.length];
        flags[0][0] = true;

        if (ss.length == 1 && ps.length == 1)
            return true;
        else if (ps.length == 1)
            return false;
        else if (ps[1] == '*')
            return false;

        for (int j = 1; j < ps.length; j++) {
            if (ps[j] == '*')
                flags[0][j] = flags[0][j - 2];

            for (int i = 1; i < ss.length; i++) {
                match(i, j);
            }
        }
        return flags[ss.length - 1][ps.length - 1];
    }

    private boolean set(int i, int j, boolean flag) {
        flags[i][j] = flag;
        return flag;
    }

    private boolean match(int i, int j) {
        if (ps[j] == '*') {
            return set(i, j, (ss[i] == ps[j - 1] || ps[j - 1] == '.') && flags[i - 1][j] || flags[i][j - 2] || flags[i][j - 1]);
        } else {
            return set(i, j, flags[i - 1][j - 1] && (ss[i] == ps[j] || ps[j] == '.'));
        }
    }
}
