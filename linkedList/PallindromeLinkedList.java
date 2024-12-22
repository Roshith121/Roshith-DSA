package org.example;

public class PallindromeLinkedList {

    public static void main(String[] args) {
        NodeLinkedList head = new NodeLinkedList(1);
        head.next = new NodeLinkedList(2);
        head.next.next = new NodeLinkedList(3);
        head.next.next.next = new NodeLinkedList(3);
        head.next.next.next.next = new NodeLinkedList(2);
        head.next.next.next.next.next = new NodeLinkedList(1);
        NodeLinkedList rev = reverseLinkedList(head);
        boolean ispallindrome =islinkedListPallindrome(head,rev);
        System.out.println(ispallindrome);
    }

    private static boolean islinkedListPallindrome(NodeLinkedList head,NodeLinkedList rev) {
        boolean result = true;
    while(head !=null && rev != null){
    if(head.data !=rev.data){
        result =false;
    }
        head = head.next;
        rev = rev.next;
    }
    return result;
    }

    private static NodeLinkedList reverseLinkedList(NodeLinkedList copy) {
        if(copy==null || copy.next==null){
            return copy;
        }
        NodeLinkedList res = reverseLinkedList(copy.next);
        copy.next.next = copy;
        copy.next =null;
        return res;
    }

    private static void print(NodeLinkedList copy) {
        while(copy!=null){
            System.out.println(copy.data);
            copy = copy.next;
        }
    }
}
