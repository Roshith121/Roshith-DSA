package org.example;

public class DeleteNode {

    public static void main(String[] args) {

        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(2);
        node.next.next = new NodeLinkedList(3);
        node.next.next.next = new NodeLinkedList(4);
//        print(node);
        deleteNode(node.next.next);
        print(node);

    }

    private static void deleteNode(NodeLinkedList node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void print(NodeLinkedList node){
        while(node!= null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
