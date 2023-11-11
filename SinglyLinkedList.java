public class SinglyLinkedList<T> extends AbstractSinglyLinkedList<T> {

    public AbstractSinglyLinkedNode<T> getNode(int index) {
        AbstractSinglyLinkedNode<T> currNode = head;
        int i;

        for (i = 0; i < index; i++) {
            if (currNode.getNext() != null) {
                currNode = currNode.getNext();
            } else {
                break;
            }
        }

        return currNode;
    }

    public void add(int index, T n) {
        AbstractSinglyLinkedNode<T> newNode = new SinglyLinkedNode<>();
        newNode.setData(n);

        AbstractSinglyLinkedNode<T> currNode = head;
        AbstractSinglyLinkedNode<T> prevNode = null;
        int i;

        if (index > length) {
            System.out.println("Index does not exist");
            return;
        }

        if (currNode == null) {
            head = newNode;
            tail = newNode;
        }
        else if (length == 1) {
            head.setNext(newNode);
            tail = newNode;
        }
        else {
            for (i = 0; i < index; i++) {
                if (currNode.getNext() == null) {
                    break;
                }
                prevNode = currNode;
                currNode = currNode.getNext();
            }

            newNode.setNext(currNode);
            prevNode.setNext(newNode);
        }
        length++;
    }

    public void add(T n) {
        AbstractSinglyLinkedNode<T> newNode = new SinglyLinkedNode<>();
        newNode.setData(n);

        if (head == null || tail == null) {
            tail = newNode;
            head = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }

        length++;
    }

    public void addFirst(T n) {
        AbstractSinglyLinkedNode<T> newNode = new SinglyLinkedNode<>();
        newNode.setData(n);

        newNode.setNext(head);
        head = newNode;

        length++;
    }

    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

    public AbstractSinglyLinkedNode<T> remove() {
        AbstractSinglyLinkedNode<T> node = new SinglyLinkedNode<>();
        return node;
    }

    public AbstractSinglyLinkedNode<T> removeAt(int index) {
        AbstractSinglyLinkedNode<T> node = new SinglyLinkedNode<>();
        return node;
    }

    public boolean remove(T n) {
        return true;
    }

    public AbstractSinglyLinkedNode<T> set(int index, T n) {
        AbstractSinglyLinkedNode<T> node = new SinglyLinkedNode<>();
        return node;
    }

    public static void main(String args[]) {
        AbstractSinglyLinkedList<Integer> intList = new SinglyLinkedList<>();
        intList.add(50);
        intList.add(60);
        intList.add(70);
        intList.add(50);
        intList.add(60);
        intList.add(70);

        intList.printList();


        AbstractSinglyLinkedList<Integer> singleNode = new SinglyLinkedList<>();
        singleNode.add(50);
        System.out.println(singleNode.getNode(0));
        System.out.println(singleNode.getNode(2));


        AbstractSinglyLinkedList<Integer> emptyList = new SinglyLinkedList<>();

    }

}
