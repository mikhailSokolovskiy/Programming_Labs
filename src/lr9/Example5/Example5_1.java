package lr9.Example5;

public class Example5_1 {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Example5_1 list = new Example5_1();

        list.add(3);
        list.add(7);
        list.add(12);
        list.add(21);

        list.display();
    }
}
