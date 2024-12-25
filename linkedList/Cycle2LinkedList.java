package org.example;

public class Cycle2LinkedList {
    public static void main(String[] args) {
        NodeLinkedList node = new NodeLinkedList(1);
        node.next = new NodeLinkedList(2);
        node.next.next = new NodeLinkedList(3);
        node.next.next.next = new NodeLinkedList(4);
        node.next.next.next.next= new NodeLinkedList(5);
        node.next.next.next.next.next = node.next;
        NodeLinkedList cycleNode = getCycleNode(node);
        print(cycleNode);
    }

    private static NodeLinkedList getCycleNode(NodeLinkedList node) {
        NodeLinkedList slow = node;
        NodeLinkedList fast = node;
        while(fast!=null){
            slow= slow.next;
            fast = fast.next.next;
            if(fast == slow)
                break;
        }
        NodeLinkedList temp = node;
        while(temp!=slow){
            temp=temp.next;
            slow =slow.next;
        }
    return slow;
    }

    private static void print(NodeLinkedList node) {
        while(node!=null){
            System.out.print(" "+node.data);
            node = node.next;
        }
    }
}
