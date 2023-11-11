public class SinglyLinkedList<T> extends AbstractSinglyLinkedList<T> {

    public SinglyLinkedList() {

    }

    public AbstractSinglyLinkedNode<T> getNode(int index) {
        if (this.head == null) {
            return null;
        }

        AbstractSinglyLinkedNode<T> currNode = this.head;
        int i;

        for (i = 0; i < index; i++) {
            if (currNode.getNext() == null) {
                break;
            }
            currNode = currNode.getNext();
        }

        return currNode;
    }

    public void add(int index, T n) {

    }

    public void add(T n) {
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>();
        newNode.setData(n);

        if (this.tail == null) {
            this.tail = new SinglyLinkedNode<T>();
            this.head = new SinglyLinkedNode<T>();
            this.tail.setNext(newNode);
            this.head.setNext(newNode);
        } else {
            this.tail.getNext().setNext(newNode);
            this.tail.setNext(newNode);
        }
        System.out.println(this.head.getNext().getData());
        System.out.println(this.tail.getNext().getData());
        this.printList();

        this.length++;

    }

    public void addFirst(T n) {
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(n);
        if (this.head != null) {
            newNode.setNext(this.head);
        }
        this.head = newNode;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
    }

    public AbstractSinglyLinkedNode<T> remove() {
        this.head = this.head.getNext();
        return this.head;
    }

    public AbstractSinglyLinkedNode<T> removeAt(int index) {
        AbstractSinglyLinkedNode<T> prevNode =  null;
        AbstractSinglyLinkedNode<T> currNode = this.head;
        int i;

        for (i = 0; i < index; i++) {
            prevNode = currNode;
            currNode = currNode.getNext();
            if (currNode.getNext() == null) {
                return currNode;
            }
        }

        prevNode.setNext(currNode.next);
        return currNode;


    }

    public boolean remove(T n) {
        AbstractSinglyLinkedNode<T> prevNode =  null;
        AbstractSinglyLinkedNode<T> currNode = this.head;

        while (currNode.getNext() != null) {
            prevNode = currNode;
            if (currNode.getData().equals(n)) {
                if (prevNode.equals(null)) {
                    this.head = currNode.getNext();
                } else {
                    prevNode.setNext(currNode.getNext());
                }
                return true;
            }
        }

        return false;
    }

    public AbstractSinglyLinkedNode<T> set(int index, T n) {
        if (this.head == null) {
            return null;
        }

        AbstractSinglyLinkedNode<T> currNode = this.head;
        int i;

        for (i = 0; i < index; i++) {
            if (currNode.getNext() == null) {
                break;
            }
            currNode = currNode.getNext();
        }

        return currNode;
    }

    public static void main(String args[]) {
        AbstractSinglyLinkedList<Integer> intList = new SinglyLinkedList<>();
        intList.add(50);
        intList.add(60);
        intList.add(70);

        System.out.println(intList.size());

        intList.printList();

    }

}
