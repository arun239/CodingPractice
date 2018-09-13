package Random.linkedList;

/**
 * Created by arun on 13/09/18.
 */
public class Arun_LinkedList {

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

    public void insertInBetween(Node prevNode, int data) {
        Node newNode = new Node(data);

        if (prevNode == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

        if (head.data == prevNode.data)
            insertAtFront(data);
        else {
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
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

    public void deleteElement(int data) {
        Node temp = head, prev = null;

        if(temp != null && temp.data == data) {
            //Delete head element
            head = temp.next;
            return;
        } else {
            while (temp != null && temp.data != data) {
                prev = temp;
                temp = temp.next;
            }
            // If key was not present in linked list
            if (temp == null) return;

            // Unlink the node from linked list
            prev.next = temp.next;

        }
    }

    public void deleteNodeFromGivenPosition(int position) {
        Node temp = head;
        int i = 0;
        if (temp !=null && position == 0) {
            head = temp.next;
            return;
        } else {
            while (temp != null && i < position - 1) {
                temp = temp.next;
                i++;
            }

            if (temp == null || temp.next == null) return;

            temp.next = temp.next.next;
        }
    }

    void deleteList()
    {
        head = null;
    }

    public int getCountRec(Node node)
    {
        // Base case
        if (node == null)
            return 0;

        // Count is this node plus rest of the list
        return 1 + getCountRec(node.next);
    }

    public int getCount()
    {
        return getCountRec(head);
    }

    // Checks whether the value x is present
    // in linked list
    public boolean search(Node head, int x)
    {
        // Base case
        if (head == null)
            return false;

        // If key is present in current node,
        // return true
        if (head.data == x)
            return true;

        // Recur for remaining list
        return search(head.next, x);
    }

    public void printNthNodeFromEnd(int n) {
        Node fast = head, slow = head;
        int count = 0;
        while (fast!= null && count < n) {
            fast = fast.next;
            count++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("Nth element from last : " + slow.data);

    }

    public int detectAndMeasureLoop()
    {
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");
                return countNodes(slow_p);
            }
        }
        return 0;
    }

    public int countNodes(Node n) {
        Node temp = n;
        int loopsize = 1;
        while (temp.next != n) {
            loopsize++;
            temp = temp.next;
        }
        return loopsize;
    }

    public void reverseLinkedList() {
        Node curr = head, prev = null, next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void printLinkedList() {
        Node node = this.head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Arun_LinkedList arunLinkedList = new Arun_LinkedList();

        Node first = new Node(1);
        Node second = new Node(2);
        first.next = second;

        arunLinkedList.head = first;

        arunLinkedList.insertAtFront(3);

        arunLinkedList.insertInBetween(first, 5);

        arunLinkedList.insertAtEnd(10);

        arunLinkedList.insertAtEnd(20);

        arunLinkedList.insertAtEnd(30);
        //arunLinkedList.head.next.next.next = first;

        int loopSize = arunLinkedList.detectAndMeasureLoop();

        if (loopSize == 0) {
            System.out.println("No Loop");
        } else {
            System.out.println("Loop size : " + loopSize);
        }


        arunLinkedList.deleteElement(10);

        arunLinkedList.deleteNodeFromGivenPosition(4);

        arunLinkedList.printLinkedList();

        if (arunLinkedList.search(arunLinkedList.head, 5))
            System.out.println("Yes 5 is present");
        else
            System.out.println("No 5 isn't present");

        int length = arunLinkedList.getCount();
        System.out.println("Length of LinkedList - " + length);

        arunLinkedList.printNthNodeFromEnd(7);

        arunLinkedList.reverseLinkedList();

        arunLinkedList.printLinkedList();

        arunLinkedList.deleteList();

    }
}
