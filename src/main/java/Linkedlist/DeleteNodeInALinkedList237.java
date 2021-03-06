package Linkedlist;

/**
 * Created by yuehu on 5/13/19.
 * 237. Delete Node in a Linked List
 * Write a function to delete a node
 * (except the tail) in a singly linked list, given only access to that node.
 */
public class DeleteNodeInALinkedList237 {
    public static void delete(ListNode node) {
        if(node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
