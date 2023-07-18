import java.util.Scanner;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAfter(int key, int data) {
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertBefore(int key, int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        if (head.data == key) {
            addFirst(data);
            return;
        }
        Node pre = null;
        Node now = head;
        while (now != null && now.data != key) {
            pre = now;
            now = now.next;
        }
        if (now == null) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = now;
        pre.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList kosong");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            if (command.equals("awal")) {
                int data = scanner.nextInt();
                linkedList.addFirst(data);
            } else if (command.equals("akhir")) {
                int data = scanner.nextInt();
                linkedList.addLast(data);
            } else if (command.equals("sebelum")) {
                int key = scanner.nextInt();
                int data = scanner.nextInt();
                linkedList.insertBefore(key, data);
            } else if (command.equals("setelah")) {
                int key = scanner.nextInt();
                int data = scanner.nextInt();
                linkedList.insertAfter(key, data);
            } else if (command.equals("cetak")) {
                linkedList.print();
            }
        }
        scanner.close();
    }
}
