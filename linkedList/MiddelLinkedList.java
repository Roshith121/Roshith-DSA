package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class MiddelLinkedList {
    public static void main(String[] args) {
        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(2);
        node.next.next = new NodeLinkedList(3);
        node.next.next.next = new NodeLinkedList(4);
        node.next.next.next.next = new NodeLinkedList(5);
        node.next.next.next.next.next = new NodeLinkedList(6);

        int mid = middleElement(node);
        System.out.println(mid);
    }

    private static int middleElement(NodeLinkedList node) {
        NodeLinkedList fast = node;
        NodeLinkedList slow = node;
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
