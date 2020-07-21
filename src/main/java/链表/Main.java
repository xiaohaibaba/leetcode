package 链表;

public class Main {

    public static void main(String[] args) {
        _206_反转链表 a = new _206_反转链表();
        ListNode node1 = new ListNode(1), node2 = new ListNode(2), node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode listNode = a.reverseList(node1);

    }
}
