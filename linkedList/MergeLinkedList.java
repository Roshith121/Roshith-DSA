package org.example;

public class MergeLinkedList {


    public static void main(String[] args) {
        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(3);
        node.next.next = new NodeLinkedList(5);
        node.next.next.next = new NodeLinkedList(8);
        NodeLinkedList node2 = new NodeLinkedList(2);
        node2.next = new NodeLinkedList(4);
        node2.next.next = new NodeLinkedList(6);
        node2.next.next.next = new NodeLinkedList(7);

        NodeLinkedList newNode = mergeTwoSortedLinkedList(node, node2);
        print(newNode);
    }

    private static NodeLinkedList mergeTwoSortedLinkedList(NodeLinkedList node, NodeLinkedList node2) {
        NodeLinkedList temp1 = node;
        NodeLinkedList temp2 = node2;
        NodeLinkedList head = new NodeLinkedList(1);
        NodeLinkedList temp =head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                NodeLinkedList a= new NodeLinkedList(temp1.data);
                temp.next =a;
                temp =a;
                temp1 =temp1.next;
            } else {
                NodeLinkedList a= new NodeLinkedList(temp2.data);
                temp.next =a;
                temp =a;
                temp2 =temp2.next;
            }
        }
        if(temp1.next==null)
            temp.next =temp2;
        else
            temp.next =temp1;

        return head.next;
    }

    private static void print(NodeLinkedList node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }
}