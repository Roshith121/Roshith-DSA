package org.example;

public class CycleInLinkedList {
    public static void main(String[] args) {
        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(2);
        node.next.next = new NodeLinkedList(3);
        node.next.next.next = new NodeLinkedList(4);
        node.next.next.next.next= new NodeLinkedList(5);
        node.next.next.next.next.next = node.next;
        System.out.println(isCycle(node));
//        print(node);
    }

    private static void print(NodeLinkedList node) {
        while(node!=null){
            System.out.print(" "+node.data);
            node = node.next;
        }
    }
    private static boolean isCycle(NodeLinkedList node) {
        NodeLinkedList slow = node;
        NodeLinkedList fast = node;
        if(node==null || node.next==null){
            return false;
        }
        while(fast!=null){
            slow = slow.next;
            if(fast.next == null)
                return false;
            fast =fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
