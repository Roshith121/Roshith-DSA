package org.example;


public class OddEvenIndices {
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
        System.out.println(" ");
        NodeLinkedList oddEven = oddEvenList(node);
        print(oddEven);

    }

    private static NodeLinkedList oddEvenList(NodeLinkedList node) {
        if(node==null || node.next==null || node.next.next==null){
            return node;
        }
        NodeLinkedList tempOdd =  indicesList(node);
        NodeLinkedList tempEven = indicesList(node.next);
        NodeLinkedList tempOddEven =tempOdd;
        while(tempOdd.next!=null){
            if(tempOdd.next.next==null){
                tempOdd.next.next =tempEven;
                break;
            }
            tempOdd = tempOdd.next;
        }
        return tempOddEven;
    }

    private static NodeLinkedList indicesList(NodeLinkedList node) {
        NodeLinkedList temp = node;
        NodeLinkedList head =new NodeLinkedList(0);
        NodeLinkedList tempO =head;
        while(temp !=null){
                NodeLinkedList odd = new NodeLinkedList(temp.data);
                tempO.next =odd;
                tempO =odd;
                if(temp.next==null)
                    break;
                temp =temp.next.next;
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
