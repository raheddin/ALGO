package my.algo.raheddin;

import my.algo.raheddin.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(3)));
        addTwoNumbers(l1, l2);

        /*
        addTwo(l1, l2, 0, new ArrayList<>());
        List<Long> r = new ArrayList<>();
        List<Long> number = getNumber(l1, r);
        System.out.println(number);*/


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return result(l1,l2);
        //ListNode a = new ListNode();
        // while (l1 == null && l2 == null && q == 0))
        // addTwoV2(l1, l2, 0, a);
        // List<Long> n1 = new ArrayList<>();
        // n1 = getNumber(a.next, n1);
        // System.out.println(n1);
        //return a.next;
    }

    public static ListNode result(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            l1 = new ListNode(0);
        }
        if (l2 == null) {
            l2 = new ListNode(0);
        }
        int q = l1.val + l2.val;
        if (q > 9) {
            q = q % 10;
            if (l1.next == null) {
                l1.next = new ListNode(1);
            } else {
                l1.next.val = l1.next.val + 1;
            }
        }

        return new ListNode(q, result(l1.next, l2.next));
    }


    public static void addTwoV2(ListNode l1, ListNode l2, int q, ListNode r) {
        if (l1 == null && l2 == null && q == 0) {
            return;
        } else if (l1 == null && l2 == null) {
            r.next = new ListNode(q);
            return;
        } else if (l2 == null && q == 0) {
            r.next = new ListNode(l1.val);
            l1 = l1.next;
        } else if (l1 == null && q == 0) {
            r.next.val = l2.val;
            l2 = l2.next;
        } else {
            int n1 = l1.val;
            int n2 = l2.val;
            int s = n1 + n2;
            if (s > 9) {
                q = s % 10;
            } else {
                r.next = new ListNode(s);
                q = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        addTwoV2(l1, l2, q, r.next);
    }

    public static List<Integer> addTwo(ListNode l1, ListNode l2, int q, List<Integer> r) {
        if (l1 == null && l2 == null && q == 0) {
            System.out.println(r);
            return r;
        } else if (l1 == null && l2 == null) {
            r.add(q);
            return r;
        } else if (l2 == null && q == 0) {
            r.add(l1.val);
            l1 = l1.next;
        } else if (l1 == null && q == 0) {
            r.add(l2.val);
            l2 = l2.next;
        } else {
            int n1 = l1.val;
            int n2 = l2.val;
            int s = n1 + n2;
            if (s > 9) {
                q = s % 10;
            } else {
                r.add(s);
                q = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return addTwo(l1, l2, q, r);
    }

    public static List<Long> getNumber(ListNode l, List<Long> r) {
        r.add((long) l.val);
        if (l.next != null) {
            getNumber(l.next, r);
        }
        return r;
    }


}
