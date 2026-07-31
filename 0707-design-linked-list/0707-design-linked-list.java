class MyLinkedList {
    Node head;

    class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {
    }

    public int get(int index) {
        Node curr = head;
        int count = 0;

        while (curr != null) {
            if (count == index) {
                return curr.val;
            }
            curr = curr.next;
            count++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node curr = head;
        for (int i = 0; i < index - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) return;

        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null || index < 0) return;

        if (index == 0) {
            head = head.next;
            return;
        }
        Node curr = head;

        for (int i = 0; i < index - 1 && curr.next != null; i++) {
            curr = curr.next;
        }
        if (curr.next == null) return;
        curr.next = curr.next.next;
    }
}