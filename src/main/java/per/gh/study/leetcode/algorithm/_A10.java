package per.gh.study.leetcode.algorithm;


public class _A10 {
    /**
     * 看错题目了
     * @param args
     */
    public static void main(String[] args) {
//        Arrays.stream("2f".split("\\*")).forEach(System.out::println);
        _A10 a10 = new _A10();
//        System.out.println(a10.search("abcaabedf".getBytes(), 0, 9, "abe3"));
//        "aab"
//        "c*a*b"
        System.out.println(a10.isMatch("aab", "c*a*b"));
//        Arrays.stream(".*.".split("\\*")).forEach(s -> System.out.println(">>>" + s));
    }


    public boolean isMatch(String s, String p) {
        byte[] pBytes = p.getBytes();
        byte[] sBytes = s.getBytes();
        if (!p.contains("*")) {
            return pBytes.length == sBytes.length && equals(pBytes, 0, sBytes, 0, pBytes.length, true);
        }

        String[] subps = p.split("\\*");
        int start = 0;
        int startSubpIndex = 0;
        int lastSubpIndex = pBytes[pBytes.length - 1] == '*' ? subps.length - 1 : subps.length - 2;
        if (pBytes[0] != '*') {// not start with *,check first
            String subp = subps[0];
            if (sBytes.length < subp.length() || !equals(subp.getBytes(), 0, sBytes, 0, subp.length(), true)) {
                return false;
            }
            startSubpIndex = 1;
            start = subp.length();
        }

        for (int i = startSubpIndex; i <= lastSubpIndex; i++) {// among *
            String subp = subps[i];
            if ((start = search(sBytes, start, subp.length(), subp)) == -1) {
                return false;
            }
            start += subp.length();
        }
        if (pBytes[pBytes.length - 1] != '*') {// not end with *, check last
            String subp = subps[subps.length - 1];
            return start <= sBytes.length - subp.length() && equals(subp.getBytes(), 0, sBytes, sBytes.length - subp.length(), subp.length(), true);
        }
        return true;
    }

    public int search(byte[] sBytes, int start, int length, String p) {
        //kmp
        int[] m = new int[p.length()];
        m[0] = -1;
        byte[] pBytes = p.getBytes();
        for (int i = 1; i < pBytes.length; i++) {
            m[i] = maxEqualPostfix(pBytes, 0, i);
        }
        int[] step = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            step[i] = i - m[i];
        }
        //search
        for (int i = 0; i <= length - pBytes.length + 1; i++) {
            if (equals(pBytes, start, sBytes, i, pBytes.length, true)) {
                return start + i;
            }
        }
        return -1;
    }

    public int maxEqualPostfix(byte[] bytes, int start, int length) {
        int max = 0;
        for (int i = 1; i < length; i++) {
            if (equals(bytes, start, bytes, start + length - i, i, false)) {
                max = i;
            }
        }
        return max;
    }

    public boolean equals(byte[] pBytes, int start1, byte[] bytes, int start2, int length, boolean bytesIsStrBytes) {
        for (int i = 0; i < length; i++) {
            if (pBytes[start1 + i] != '.' && (bytesIsStrBytes || bytes[start2 + i] != '.') && pBytes[start1 + i] != bytes[start2 + i]) {
                return false;
            }
        }
        return true;
    }
}
