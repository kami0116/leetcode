package per.gh.study.leetcode.algorithm;

import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class A2 {
    public static void main(String[] args) {
        //        [2,4,3]
        //        [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        A2 a2 = new A2();

        for (ListNode r = a2.addTwoNumbers(l1, l2); r != null; r = r.next) {
            System.out.print(r.val);
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        int t = 0;
        for (; l1 != null && l2 != null; l1 = l1.next, l2 = l2.next, tail = tail.next) {
            int s = l1.val + l2.val + t;
            t = s / 10;
            tail.next = new ListNode(s % 10);

        }
        ListNode l = l1;
        if (l2 != null) {
            l = l2;
        }
        for (; l != null; l = l.next, tail = tail.next) {
            int s = l.val + t;
            t = s / 10;
            tail.next = new ListNode(s % 10);
        }
        if (t != 0) {
            tail.next = new ListNode(t);
        }
        return head.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
