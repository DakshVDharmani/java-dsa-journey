//Optimal Solution 


class MyLinkedList {

    class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size)
            return -1;

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        if (size == 0) {
            head = newNode;
            tail = newNode;
        } 
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        if (size == 0) {
            head = newNode;
            tail = newNode;
        } 
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val);

        newNode.prev = temp.prev;
        newNode.next = temp;

        temp.prev.next = newNode;
        temp.prev = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size)
            return;

        if (index == 0) {

            head = head.next;

            if (head != null)
                head.prev = null;
            else
                tail = null;

            size--;
            return;
        }

        if (index == size - 1) {

            tail = tail.prev;
            tail.next = null;

            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }
}

//Time and space complexity is based on the functions utilized. 