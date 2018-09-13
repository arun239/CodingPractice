package Random.linkedList;

/**
 * Created by arun on 13/09/18.
 */
public class CheckLinkedListPalindrom {
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

    public boolean checkPalindrom() {
        boolean result = false;
        Node second_half, midNode = null;
        Node slow_p = head, fast_p = head, prev_to_slow_p = head;
        while (fast_p != null && fast_p.next != null) {
            fast_p = fast_p.next.next;
            prev_to_slow_p = slow_p;
            slow_p = slow_p.next;
        }

        if (fast_p != null) {
            midNode = slow_p;
            slow_p = slow_p.next;
        }

        second_half = slow_p;
        prev_to_slow_p.next = null;
        Node reversed_secondHalf = reverseLinkedList(second_half);
        result = comapreLists(head, reversed_secondHalf);
        Node original_secondHalf = reverseLinkedList(reversed_secondHalf);

        if (midNode != null) {
            prev_to_slow_p.next = midNode;
            midNode.next = original_secondHalf;
        } else {
            prev_to_slow_p.next = original_secondHalf;
        }
      return result;
    }

    public Node reverseLinkedList(Node node) {
        Node curr = node, prev = null, next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public boolean comapreLists(Node first, Node second) {
        Node temp1 = first;
        Node temp2 = second;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if (temp1 == null && temp2 == null)
            return true;

        /* Will reach here when one is NULL
           and other is not */
        return false;
    }

    public static void main(String[] args) {
        CheckLinkedListPalindrom checkLinkedListPalindrom = new CheckLinkedListPalindrom();

        checkLinkedListPalindrom.head = new Node(1);
        checkLinkedListPalindrom.insertAtEnd(2);
        checkLinkedListPalindrom.insertAtEnd(3);
        checkLinkedListPalindrom.insertAtEnd(4);
        checkLinkedListPalindrom.insertAtEnd(5);
        checkLinkedListPalindrom.insertAtEnd(2);
        checkLinkedListPalindrom.insertAtEnd(1);

        checkLinkedListPalindrom.printLinkedList();

        boolean isPalindrom = checkLinkedListPalindrom.checkPalindrom();

        System.out.println("Pallindrom String : " + isPalindrom);

        checkLinkedListPalindrom.printLinkedList();


    }
}
