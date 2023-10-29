class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {

    Node head;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public int get(int index) {
        Node currNode = head;
        while(currNode != null && index != 0) {
            index = index - 1;
            currNode = currNode.next;    
        }
        if (currNode != null) {
            return currNode.val;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newHeadNode = new Node(val);
        newHeadNode.next = head;
        head = newHeadNode;
        this.size++;   
    }
    
    public void addAtTail(int val) {
        Node currNode = head;
        Node newTailNode = new Node(val);
        if (head == null) {
            head = newTailNode;
        }
        else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newTailNode;
        }
        this.size++; 
    }
    
    public void addAtIndex(int index, int val) {
        if (index > this.size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        } else {
            Node currNode = head;
            Node prevNode = null;
            while (index > 0) {
                prevNode = currNode;
                currNode = currNode.next;
                index--;
            }
            Node newNode = new Node(val);
            prevNode.next = newNode;
            newNode.next = currNode;
            this.size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= this.size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            this.size--;
        } else {
            Node currNode = head;
            Node prevNode = null;
            while (index > 0) {
                prevNode = currNode;
                currNode = currNode.next;
                index--;
            }
            prevNode.next = currNode.next;
            this.size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
