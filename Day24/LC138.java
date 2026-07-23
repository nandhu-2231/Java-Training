package Day24;

import java.util.HashMap;

public class LC138 {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node copyRandomList(Node head) {

        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;

        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {

            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);

            curr = curr.next;
        }

        return map.get(head);
    }

    static void print(Node head) {

        while (head != null) {

            int random = (head.random == null) ? -1 : head.random.val;

            System.out.println("Node = " + head.val + ", Random = " + random);

            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Node copy = copyRandomList(n1);

        print(copy);
    }
}