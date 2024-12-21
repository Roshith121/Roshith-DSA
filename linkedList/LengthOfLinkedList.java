package org.example;

public class LengthOfLinkedList {
    public static void main(String[] args) {


        int count=0;
        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(2);
        node.next.next = new NodeLinkedList(3);
        node.next.next.next = new NodeLinkedList(4);
        count = countAndPrint(node,count);
        System.out.println("length of LinkedList, "+count);

    }

    private static int countAndPrint(NodeLinkedList node,int count) {
        while(node!=null){
            System.out.print(" "+node.data);
            node = node.next;
            count+=1;
        }
        return count;
    }

}
