public class ReverseDoublyLL {
    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data){
            this.prev = null;
            this.data = data;
            this.next = null;
        }

        Node(Node prev, int data, Node next){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    public static Node insertAtHead(Node head, int data){
        Node newNode = new Node(data);
        if( head == null){
            head = newNode;
        } else {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        return head;
    }

    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static Node reverseDoublyLL(Node head){
        Node temp = null;
        Node current = head;
        while(current != null){
            head = current;
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtHead(head, 10);
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 30);

        printList(head); // Output: 30 -> 20 -> 10 -> null

        head = reverseDoublyLL(head);
        printList(head); // Output: 10 -> 20 -> 30 -> null
    }
}
