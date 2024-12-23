package org.example;

public class DeletingMiddleElement {

    public static void main(String[] args) {

        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(2);
        node.next.next = new NodeLinkedList(3);
        node.next.next.next = new NodeLinkedList(4);
        node.next.next.next.next= new NodeLinkedList(5);
        deleteMiddleElement(node);
        print(node);

    }

    private static NodeLinkedList deleteMiddleElement(NodeLinkedList node) {

        NodeLinkedList slow = node;
        NodeLinkedList fast = node;
        while(fast.next.next !=null && fast.next.next.next !=null){
            slow =slow.next;
            fast =fast.next.next;
        }
        slow.next =slow.next.next;
        return node;
    }

    private static void print(NodeLinkedList node) {
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
