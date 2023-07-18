//public class ASD1
//{
//    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.insert(100);
//        linkedList.insert(200);
//        linkedList.insert(300);
//        linkedList.insert(400);
//        linkedList.print();
//        linkedList.addLast(500);
//        linkedList.addFirst(50);
//        linkedList.addAfter(200, 250);
//        linkedList.print();
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        linkedList.remove(300);
//        linkedList.print();
//        linkedList.get(3);
//        linkedList.replace(2,390);
//        linkedList.print();
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node currentNode = head;
//        while (currentNode.next != null) {
//            currentNode = currentNode.next;
//        }
//        currentNode.next = newNode;
//    }
//
//
//
//    public void addLast(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node currentNode = head;
//        while (currentNode.next != null) {
//            currentNode = currentNode.next;
//        }
//        currentNode.next = newNode;
//    }
//
//    public void addFirst(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void addAfter(int target, int data) {
//        Node currentNode = head;
//        while (currentNode != null && currentNode.data != target) {
//            currentNode = currentNode.next;
//        }
//        if (currentNode == null) {
//            System.out.println("Sasaran tidak dapat diketahui");
//            return;
//        }
//        Node newNode = new Node(data);
//        newNode.next = currentNode.next;
//        currentNode.next = newNode;
//    }
//
//    public void removeFirst() {
//        if (head == null) {
//            System.out.println("LinkedList kosong");
//            return;
//        }
//        head = head.next;
//    }
//
//    public void removeLast() {
//        if (head == null) {
//            System.out.println("LinkedList kosong");
//            return;
//        }
//        if (head.next == null) {
//            head = null;
//            return;
//        }
//        Node currentNode = head;
//        while (currentNode.next.next != null) {
//            currentNode = currentNode.next;
//        }
//        currentNode.next = null;
//    }
//
//    public void remove(int target) {
//        if (head == null) {
//            System.out.println("Sasaran tidak dapat diketahui");
//            return;
//        }
//        if (head.data == target) {
//            head = head.next;
//            return;
//        }
//        Node currentNode = head;
//        while (currentNode.next != null && currentNode.next.data != target) {
//            currentNode = currentNode.next;
//        }
//        if (currentNode.next == null) {
//            System.out.println("Sasaran tidak dapat diketahui");
//            return;
//        }
//        currentNode.next = currentNode.next.next;
//    }
//
//    public void print() {
//        Node currentNode = head;
//        while (currentNode != null) {
//            System.out.print(currentNode.data + " ");
//            currentNode = currentNode.next;
//        }
//        System.out.println();
//    }
//    public Node get(int index) {
//        Node currentNode = head;
//        int currentIndex = 0;
//        while (currentNode != null && currentIndex < index) {
//            currentNode = currentNode.next;
//            currentIndex++;
//        }
//        if (currentNode == null) {
//            System.out.println("Indeks di luar batas");
//            return null;
//        }
//        return currentNode;
//    }
//
//    public void replace(int index, int newData) {
//        Node currentNode = head;
//        int currentIndex = 0;
//        while (currentNode != null && currentIndex < index) {
//            currentNode = currentNode.next;
//            currentIndex++;
//        }
//        if (currentNode == null) {
//            System.out.println("Indeks di luar batas");
//            return;
//        }
//        currentNode.data = newData;
//    }
//}
//
