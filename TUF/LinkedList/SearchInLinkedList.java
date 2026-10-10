public class SearchInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static int search(Node head, int key) {
        Node current = head;

        while (current != null) {
            if(current.data == key){
                return 1; // Key found
            }
            current = current.next;
        }

        return 0; // Key not found
    }

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4))));
        System.out.println("Key found: " + search(head, 3)); // Output: 1
        System.out.println("Key found: " + search(head, 5)); // Output: 0
    }
}