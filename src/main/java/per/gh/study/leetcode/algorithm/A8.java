package per.gh.study.leetcode.algorithm;

public class A8 {
    public static void main(String[] args) {
        A8 a8 = new A8();
        System.out.println(a8.myAtoi("-42"));
        System.out.println(a8.myAtoi("         -42"));
        System.out.println(a8.myAtoi("4193 with words"));
        System.out.println(a8.myAtoi("words and 987"));
        System.out.println(a8.myAtoi("-91283472332"));
        System.out.println(a8.myAtoi("3.14159"));
        System.out.println(a8.myAtoi("  0000000000012345678"));
        System.out.println(a8.myAtoi("+9"));
        System.out.println(a8.myAtoi("2147483648"));
    }

    public int myAtoi(String s) {
        s = s.trim();
        byte[] bytes = s.getBytes();
        if (bytes.length==0){
            return 0;
        }
        boolean neg = bytes[0] == '-';
        int start = neg || bytes[0] == '+' ? 1 : 0;
        int length = 0;
        boolean notZeroStart = false;
        for (int i = start; i < bytes.length; i++) {
            byte b = bytes[i];
            if (b < '0' || b > '9') {
                break;
            } else {
                if (notZeroStart) {
                    length++;
                } else if (b != '0') {
                    notZeroStart = true;
                    length++;
                } else {
                    start++;
                }
            }
        }
        if (length > 10) {
            return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        } else if (length == 0) {
            return 0;
        }
        boolean flag = length == 10;
        long r = 0;
        for (int i = start; i < start + length; i++) {
            byte b = bytes[i];
            r *= 10;
            r += b - '0';
            if (flag && (r > 2147483647L && !neg) || (r > 2147483648L && neg)) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return (int) (neg ? -r : r);
    }
}
