package 链表;

/**
 * 类描述:
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 创建人:    lihy  
 * 创建时间:  2020/05/16 0:31
 */
public class _206_反转链表 {

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    /**
     * 非递归
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = null;

        while (head != null) {
            ListNode tem = head.next;
            newHead = head;
            head = tem;
        }

        return newHead;
    }
}
