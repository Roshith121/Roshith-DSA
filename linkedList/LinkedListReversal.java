package org.example;

public class LinkedListReversal {

    public static void main(String[] args) {

        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(2);
        node.next.next = new NodeLinkedList(3);
        node.next.next.next = new NodeLinkedList(4);
        System.out.println(" before reversing : ");
        print(node);
        node = reverseNodeUsingRecursion(node);
        System.out.println("");
        System.out.println(" After reversing : ");
        print(node);
    }

    private static void print(NodeLinkedList node) {
        while(node!=null){
            System.out.print(" "+node.data);
            node = node.next;
        }
    }


    private static NodeLinkedList reverseNodeUsingRecursion(NodeLinkedList node) {

        if(node == null || node.next==null)
            return node;

        NodeLinkedList rev = reverseNodeUsingRecursion(node.next);
        node.next.next = node;
        node.next=null;
        return rev;
    }
}
