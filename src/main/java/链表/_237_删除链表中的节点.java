package 链表;

/**
 * 类描述:
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 创建人:    lihy  
 * 创建时间:  2020/05/16 0:23
 */
public class _237_删除链表中的节点 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
