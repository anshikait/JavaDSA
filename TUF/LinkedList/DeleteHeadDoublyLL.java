public class DeleteHeadDoublyLL {
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

            if (prev != null)
                prev.next = this;

            if (next != null)
                next.prev = this;
            }
        }

    public static Node deleteHead(Node head){
        if( head == null){
            System.out.println("List is empty. Cannot delete head.");
            return null;
        } else if(head.next == null){
            head = null;
        } else {
            head = head.next;
            head.prev = null;
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

    public static void main(String[] args) {
        Node head = null;
        head = new Node(10);
        Node second = new Node(head, 20, null);
        Node third = new Node(second, 30, null);
        head = deleteHead(head);

        printList(head); // Output: 20 -> 10 -> null
    }
}