package per.gh.study.leetcode.algorithm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class A1622 {
    public static void main(String[] args) throws Exception {
        JSONArray funcs = (JSONArray) JSON.parse("[\"Fancy\",\"append\",\"getIndex\",\"append\",\"multAll\",\"getIndex\",\"getIndex\",\"addAll\",\"addAll\",\"multAll\",\"append\",\"getIndex\",\"getIndex\",\"multAll\",\"getIndex\",\"addAll\",\"append\",\"multAll\",\"getIndex\",\"getIndex\",\"getIndex\",\"append\",\"addAll\",\"multAll\",\"getIndex\",\"addAll\",\"append\",\"getIndex\",\"getIndex\",\"append\",\"multAll\",\"getIndex\",\"addAll\",\"multAll\",\"multAll\",\"addAll\",\"getIndex\",\"addAll\",\"multAll\",\"getIndex\",\"append\",\"addAll\",\"addAll\",\"append\",\"multAll\",\"getIndex\",\"addAll\",\"append\",\"append\",\"append\",\"addAll\",\"getIndex\",\"append\",\"append\",\"append\",\"getIndex\",\"getIndex\",\"getIndex\",\"getIndex\",\"append\",\"addAll\",\"getIndex\",\"append\",\"append\",\"append\",\"append\",\"multAll\",\"getIndex\",\"append\",\"multAll\",\"getIndex\",\"getIndex\",\"addAll\",\"append\",\"append\",\"append\",\"getIndex\",\"getIndex\",\"getIndex\",\"addAll\",\"addAll\",\"addAll\",\"multAll\",\"getIndex\",\"append\",\"multAll\",\"append\",\"getIndex\",\"append\",\"multAll\",\"getIndex\",\"multAll\",\"getIndex\",\"append\",\"append\",\"multAll\",\"append\",\"getIndex\",\"addAll\",\"addAll\",\"append\",\"multAll\",\"getIndex\",\"append\",\"getIndex\",\"getIndex\",\"append\",\"addAll\",\"append\",\"append\",\"getIndex\",\"addAll\",\"getIndex\",\"append\",\"addAll\",\"append\",\"append\",\"addAll\",\"multAll\",\"append\",\"getIndex\",\"multAll\",\"multAll\",\"addAll\",\"append\",\"multAll\",\"append\",\"getIndex\",\"append\",\"addAll\",\"addAll\",\"getIndex\",\"getIndex\",\"append\",\"append\",\"append\",\"getIndex\",\"getIndex\",\"getIndex\",\"append\",\"addAll\",\"getIndex\",\"append\",\"multAll\",\"append\",\"addAll\",\"multAll\",\"getIndex\",\"getIndex\",\"addAll\",\"append\",\"append\",\"getIndex\",\"append\",\"append\",\"addAll\",\"append\",\"getIndex\",\"getIndex\",\"multAll\",\"getIndex\",\"multAll\",\"append\",\"multAll\",\"getIndex\",\"multAll\",\"addAll\",\"getIndex\",\"addAll\",\"multAll\",\"append\",\"append\",\"getIndex\",\"addAll\",\"append\",\"getIndex\",\"getIndex\",\"multAll\",\"getIndex\",\"getIndex\",\"multAll\",\"multAll\",\"getIndex\",\"getIndex\",\"multAll\",\"getIndex\",\"append\",\"append\",\"addAll\",\"addAll\",\"getIndex\",\"append\",\"getIndex\",\"getIndex\",\"getIndex\",\"addAll\",\"getIndex\",\"multAll\",\"addAll\",\"getIndex\",\"append\",\"addAll\",\"multAll\",\"getIndex\",\"multAll\",\"addAll\",\"multAll\",\"getIndex\",\"append\",\"addAll\",\"getIndex\",\"multAll\",\"multAll\",\"addAll\",\"getIndex\",\"getIndex\",\"getIndex\",\"getIndex\",\"addAll\",\"append\",\"getIndex\",\"append\",\"addAll\",\"addAll\",\"multAll\",\"multAll\",\"append\",\"multAll\",\"getIndex\",\"append\",\"multAll\",\"append\",\"getIndex\",\"addAll\",\"append\",\"addAll\",\"addAll\",\"multAll\",\"multAll\",\"append\",\"getIndex\",\"multAll\",\"append\",\"getIndex\",\"multAll\",\"append\",\"append\",\"addAll\",\"append\",\"multAll\",\"multAll\",\"append\",\"multAll\",\"append\",\"multAll\",\"addAll\",\"multAll\",\"getIndex\",\"append\",\"append\",\"append\",\"addAll\",\"append\",\"getIndex\",\"append\",\"multAll\",\"multAll\",\"append\",\"getIndex\",\"getIndex\",\"addAll\",\"multAll\",\"getIndex\",\"append\",\"getIndex\",\"multAll\",\"append\",\"addAll\",\"append\",\"append\",\"getIndex\",\"addAll\",\"addAll\",\"append\",\"getIndex\",\"append\",\"multAll\",\"append\",\"append\",\"multAll\",\"addAll\",\"multAll\",\"addAll\",\"getIndex\",\"getIndex\",\"multAll\",\"addAll\",\"getIndex\",\"addAll\",\"append\",\"append\",\"addAll\",\"append\",\"getIndex\",\"addAll\",\"append\",\"getIndex\",\"getIndex\",\"getIndex\",\"getIndex\",\"append\",\"multAll\",\"getIndex\",\"append\",\"append\",\"addAll\",\"getIndex\",\"append\",\"append\",\"getIndex\",\"multAll\",\"append\",\"append\",\"addAll\",\"getIndex\",\"append\",\"multAll\",\"append\",\"multAll\",\"multAll\",\"append\",\"multAll\",\"multAll\",\"addAll\",\"addAll\",\"addAll\",\"multAll\",\"getIndex\",\"addAll\",\"append\",\"getIndex\",\"multAll\",\"append\",\"getIndex\",\"append\",\"append\",\"getIndex\",\"getIndex\",\"addAll\",\"getIndex\",\"addAll\",\"addAll\",\"append\",\"multAll\",\"multAll\",\"append\",\"addAll\",\"addAll\",\"addAll\",\"addAll\",\"append\",\"multAll\",\"getIndex\",\"getIndex\",\"append\",\"multAll\",\"append\",\"append\",\"getIndex\",\"append\",\"append\",\"addAll\",\"append\",\"addAll\",\"append\",\"append\",\"getIndex\",\"addAll\",\"getIndex\",\"addAll\",\"multAll\",\"getIndex\",\"addAll\",\"multAll\",\"append\",\"addAll\",\"addAll\",\"multAll\",\"getIndex\",\"multAll\",\"getIndex\",\"getIndex\",\"getIndex\",\"multAll\",\"append\",\"multAll\",\"append\",\"multAll\",\"addAll\",\"getIndex\",\"multAll\",\"getIndex\",\"append\",\"append\",\"append\",\"append\",\"addAll\",\"append\",\"multAll\",\"append\",\"multAll\",\"multAll\",\"multAll\",\"getIndex\",\"addAll\",\"append\",\"multAll\",\"append\",\"multAll\",\"multAll\",\"addAll\",\"getIndex\",\"append\",\"addAll\",\"addAll\",\"multAll\",\"addAll\",\"getIndex\",\"append\",\"addAll\",\"addAll\",\"multAll\",\"multAll\",\"getIndex\",\"getIndex\",\"getIndex\",\"getIndex\",\"getIndex\",\"addAll\",\"getIndex\",\"multAll\",\"append\",\"multAll\",\"append\",\"multAll\",\"getIndex\",\"addAll\",\"append\",\"append\",\"append\",\"multAll\",\"multAll\",\"getIndex\",\"getIndex\"]");
        JSONArray params = (JSONArray) JSON.parse("[[],[5],[0],[16],[13],[1],[0],[12],[11],[15],[7],[1],[1],[3],[1],[2],[5],[13],[0],[1],[3],[10],[13],[7],[3],[7],[2],[0],[5],[15],[16],[6],[11],[3],[5],[12],[3],[10],[9],[0],[11],[5],[14],[10],[16],[5],[6],[9],[11],[11],[13],[16],[13],[5],[15],[6],[12],[4],[14],[7],[12],[2],[9],[13],[16],[9],[16],[8],[7],[15],[0],[12],[6],[11],[10],[15],[21],[0],[19],[4],[16],[10],[3],[13],[10],[2],[2],[19],[3],[2],[15],[6],[2],[14],[2],[8],[13],[2],[9],[14],[4],[9],[17],[2],[29],[26],[2],[9],[4],[13],[29],[4],[10],[4],[3],[16],[12],[4],[4],[7],[24],[10],[3],[6],[2],[8],[3],[13],[5],[13],[12],[16],[17],[15],[14],[11],[39],[33],[32],[5],[8],[43],[15],[10],[14],[12],[4],[43],[13],[8],[3],[4],[41],[3],[3],[8],[11],[2],[37],[10],[39],[8],[8],[16],[4],[9],[8],[18],[16],[5],[2],[8],[8],[11],[8],[34],[54],[16],[3],[19],[4],[5],[12],[18],[5],[24],[15],[16],[12],[3],[8],[4],[52],[27],[43],[15],[55],[14],[4],[39],[9],[14],[14],[10],[10],[13],[14],[60],[3],[15],[47],[13],[3],[8],[23],[3],[16],[2],[11],[15],[16],[10],[10],[5],[14],[6],[4],[3],[59],[8],[8],[5],[5],[11],[11],[11],[8],[14],[15],[3],[0],[8],[11],[9],[3],[4],[3],[5],[15],[7],[7],[2],[5],[12],[6],[12],[6],[49],[8],[14],[10],[16],[8],[65],[3],[14],[8],[14],[15],[38],[7],[12],[68],[3],[73],[13],[5],[2],[6],[2],[56],[12],[6],[7],[43],[2],[15],[9],[12],[14],[15],[9],[13],[64],[17],[16],[2],[4],[7],[9],[10],[7],[10],[65],[3],[6],[28],[68],[68],[84],[11],[11],[14],[4],[16],[13],[25],[7],[14],[73],[10],[15],[10],[9],[90],[4],[10],[4],[6],[10],[6],[15],[9],[15],[16],[5],[8],[3],[15],[12],[20],[13],[2],[95],[2],[12],[20],[85],[11],[77],[2],[11],[2],[12],[10],[8],[7],[4],[10],[5],[12],[2],[87],[50],[10],[2],[9],[15],[20],[15],[5],[10],[12],[9],[15],[8],[43],[10],[62],[10],[11],[62],[3],[7],[6],[2],[3],[16],[69],[8],[74],[67],[65],[12],[15],[9],[8],[11],[4],[29],[10],[64],[10],[9],[13],[14],[8],[10],[8],[13],[14],[14],[8],[108],[5],[9],[16],[14],[5],[11],[2],[2],[8],[7],[15],[2],[13],[88],[6],[7],[14],[8],[14],[79],[35],[51],[11],[84],[12],[99],[11],[16],[12],[14],[15],[106],[10],[6],[10],[15],[6],[9],[88],[31]]");
        A1622 a1622 = new A1622();
        Map<String, Method> methodMap = new HashMap<>();
        for (Method m : A1622.class.getDeclaredMethods()) {
            methodMap.put(m.getName(), m);
        }

        for (int i = 1; i < funcs.size(); i++) {
            String funName = (String) funcs.get(i);
            Integer o = (Integer) ((JSONArray) params.get(i)).get(0);
            System.out.println(funName + "(" + o + ")  => " + methodMap.get(funName).invoke(a1622, o));
        }
    }

    public A1622() {
        init();
    }

    private int index = 0;
    private MyBigDecimal[] data;

    private void init() {
        data = new MyBigDecimal[10];
    }

    public void append(int val) {
        if (index == data.length) {
            MyBigDecimal[] newData = new MyBigDecimal[(int) (data.length * 1.5)];
            for (int i = 0; i < index; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[index++] = new MyBigDecimal(val);
    }

    public void addAll(int inc) {
        for (int i = 0; i < index; i++) {
            data[i] = data[i].add(new MyBigDecimal(inc));
        }
    }

    public void multAll(int m) {
        for (int i = 0; i < index; i++) {
            data[i] = data[i].mul(new MyBigDecimal(m));
        }
    }

    public int getIndex(int idx) {
        if (idx >= index) {
            return -1;
        }
        return data[idx].mod(1000000007).toInt();
    }

    static class MyBigDecimal {
        byte[] data;
        int index;

        private MyBigDecimal() {
        }

        MyBigDecimal(int i) {
            MyBigDecimal t = valueOf(i);
            data = t.data;
            index = t.index;
        }

        static MyBigDecimal valueOf(int i) {
            byte[] data = new byte[4];
            data[0] = (byte) i;
            data[1] = (byte) (i >> 8);
            data[2] = (byte) (i >> 16);
            data[3] = (byte) (i >> 24);
            int index = 0;
            for (int j = 3; j > 0; j--) {
                if (data[j] != 0) {
                    index = j;
                    break;
                }
            }
            MyBigDecimal myBigDecimal = new MyBigDecimal();
            myBigDecimal.data = data;
            myBigDecimal.index = index;
            return myBigDecimal;
        }

        MyBigDecimal(byte[] data) {
            this.data = data.clone();
            index = 0;
            for (int j = data.length - 1; j > 0; j--) {
                if (data[j] != 0) {
                    index = j;
                    break;
                }
            }
        }

        MyBigDecimal add(MyBigDecimal i) {
            byte[] r = new byte[Math.max(index, i.index) + 2];
            for (int j = 0; j <= Math.min(index, i.index); j++) {
                int t = (data[j] & 0xFF) + (i.data[j] & 0xFF) + (r[j] & 0xFF);
                r[j] = (byte) t;
                r[j + 1] = (byte) (t >> 8);
            }
            for (int j = Math.min(index, i.index) + 1; j <= index; j++) {
                int t = (data[j] & 0xFF) + (r[j] & 0xFF);
                r[j] = (byte) t;
                r[j + 1] = (byte) (t >> 8);
            }

            for (int j = Math.min(index, i.index) + 1; j <= i.index; j++) {
                int t = (i.data[j] & 0xFF) + (r[j] & 0xFF);
                r[j] = (byte) t;
                r[j + 1] = (byte) (t >> 8);
            }
            return new MyBigDecimal(r);
        }

        void add(byte b, byte[] bs, int idx) {
            if (b != 0) {
                int t = (bs[idx] & 0xFF) + (b & 0xFF);
                bs[idx] = (byte) t;
                add((byte) (t >> 8), bs, idx + 1);
            }
        }

        MyBigDecimal mul(MyBigDecimal i) {
            byte[] r = new byte[index + i.index + 3];
            for (int j = 0; j <= index; j++) {
                for (int k = 0; k <= i.index; k++) {
                    int t = (data[j] & 0xFF) * (i.data[k] & 0xFF);
                    add((byte) t, r, j + k);
                    add((byte) (t >> 8), r, j + k + 1);
                }
            }
            return new MyBigDecimal(r);
        }

        int toInt() {
            long t = 0;
            if (index < 4) {
                for (int j = index; j >= 0; j--) {
                    t += (data[j] & 0xFF) << (j * 8);
                }
            } else {
                for (int j = 3; j >= 0; j--) {
                    t += (data[j] & 0xFF) << (j * 8);
                }
            }
            return (int) t;
        }

        MyBigDecimal mod(int i) {
            MyBigDecimal r = new MyBigDecimal(data);

            for (; r.index >= 4; ) {
                long t = 0;
                for (int k = 0; k < 5; k++) {
                    t = (t << 8) + (r.data[r.index - k] & 0xFF);
                }
                MyBigDecimal d = valueOf((int) (t % i));
                r.index-=4-d.index;
                for (int k = 0; k <= d.index; k++) {
                    r.data[r.index - k] = d.data[d.index - k];
                }
            }
            long t = 0;
            for (int k = 0; k <= r.index; k++) {
                t = (t << 8) + (r.data[r.index - k] & 0xFF);
            }
            return new MyBigDecimal((int) (t % i));
        }
    }
}
