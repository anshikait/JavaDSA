public class InsertAtHead {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static Node insertAtHead(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

    public static void main(String[] args) {
        Node head = null;

        head = insertAtHead(head, 10);
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 30);

        printList(head); // Output: 30 -> 20 -> 10 -> null
    }
}