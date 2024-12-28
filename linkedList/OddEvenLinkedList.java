package org.example;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(8);
        node.next.next = new NodeLinkedList(2);
        node.next.next.next = new NodeLinkedList(3);
        NodeLinkedList node2 = new NodeLinkedList(5);
        node2.next = new NodeLinkedList(4);
        node2.next.next = new NodeLinkedList(6);
        node2.next.next.next = new NodeLinkedList(7);
        node.next.next.next.next=node2;
        print(node);
        NodeLinkedList oddeven = oddEvenList(node);
        System.out.println("");
        System.out.println("odd even Linked List");
        print(oddeven);
    }

    private static NodeLinkedList oddEvenList(NodeLinkedList node) {
        NodeLinkedList tempOdd =  oddLinkedList(node);
        NodeLinkedList tempEven = evenLinkedList(node);
        NodeLinkedList tempOddEven =tempOdd;
        while(tempOdd.next!=null){
            tempOdd = tempOdd.next;
            if(tempOdd.next.next==null){
                tempOdd.next.next =tempEven;
                break;
            }
        }
        return tempOddEven;
    }

    private static NodeLinkedList oddLinkedList(NodeLinkedList node) {
        NodeLinkedList temp = node;
        NodeLinkedList head =new NodeLinkedList(0);
        NodeLinkedList tempO =head;
        while(temp !=null){
            if(temp.data%2!=0){
                NodeLinkedList odd = new NodeLinkedList(temp.data);
                tempO.next =odd;
                tempO =odd;
            }
            temp =temp.next;
        }
        return head.next;
    }

    private static NodeLinkedList evenLinkedList(NodeLinkedList node) {
        NodeLinkedList temp = node;
        NodeLinkedList head =new NodeLinkedList(0);
        NodeLinkedList tempO =head;
        while(temp !=null){
            if(temp.data%2==0){
                NodeLinkedList even = new NodeLinkedList(temp.data);
                tempO.next =even;
                tempO =even;
            }
            temp =temp.next;
        }
        return head.next;
    }

    private static void print(NodeLinkedList node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }
}