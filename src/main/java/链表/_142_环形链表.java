package 链表;

import java.util.List;

/**
 * 类描述:
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * 创建人:    lihy  
 * 创建时间:  2020/05/16 0:31
 */
public class _142_环形链表 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
