package Random.linkedList;

/**
 * Created by arun on 13/09/18.
 */
public class SwapLinkedListNodes {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);

        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        if (head == null) {
            insertAtFront(data);
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printLinkedList() {
        Node node = this.head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void swapSpecificElements(int x, int y) {
        Node first = head, prevToFirst = null, second = head, prevToSecond = null, temp = null;

        while(first != null && first.data != x) {
            prevToFirst = first;
            first = first.next;
        }

        while(second != null && second.data != y) {
            prevToSecond = second;
            second = second.next;
        }

        if (first == null || second == null)
            return;

        if (prevToFirst != null)
            prevToFirst.next = second;
        else
            head = second;

        if (prevToSecond != null)
            prevToSecond.next = first;
        else
            head = first;

        temp = second.next;
        second.next = first.next;
        first.next = temp;
    }

    public static void main(String[] args) {
        SwapLinkedListNodes swapLinkedListNodes = new SwapLinkedListNodes();
        swapLinkedListNodes.head = new Node(10);
        swapLinkedListNodes.insertAtEnd(15);
        swapLinkedListNodes.insertAtEnd(12);
        swapLinkedListNodes.insertAtEnd(13);
        swapLinkedListNodes.insertAtEnd(20);
        swapLinkedListNodes.insertAtEnd(14);

        swapLinkedListNodes.printLinkedList();

        swapLinkedListNodes.swapSpecificElements(10, 14);

        swapLinkedListNodes.printLinkedList();
    }
}
