public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int[] values = new int[] { 1, 2, 3, 4, 5, 6 };

        for (int v : values) {
            ll.insert(v);
        }

        ll.printLinkedList();

        ll.head = ll.reverseLinkedList(ll.head);
        System.out.println("\nAfter reversing: ");
        ll.printLinkedList();
    }
}


class Node { 

    int value;
    Node next;

    public Node(int value) { 
        this.value = value;
        this.next = null;
    }


}

class LinkedList {
    Node head;

    public Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void printLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = new Node(value);
            return;
        }

        newNode.next = null;

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
        return;
    }
}