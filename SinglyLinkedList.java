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
            System.out.println("Oh no! Can't append at position " + index + "!");
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

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }


        length++;
    }

    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

    public AbstractSinglyLinkedNode<T> remove() {
        AbstractSinglyLinkedNode<T> removedNode= head;
        head = head.getNext();
        length--;
        return removedNode;
    }

    public AbstractSinglyLinkedNode<T> removeAt(int index) {
        AbstractSinglyLinkedNode<T> currNode = head;
        AbstractSinglyLinkedNode<T> prevNode = null;
        int i;

        if (index > length) {
            System.out.println("Oh no! Can't append at position " + index + "!");
            return null;
        }

        // remove only node
        if (currNode.getNext() == null) {
            head = null;
            tail = null;
        } else {
            // get selected node
            for (i = 0; i < index; i++) {
                prevNode = currNode;
                currNode = currNode.getNext();
            }
            // remove head node
            if (prevNode == null) {
 
                head = head.getNext();
                currNode.setNext(null);
            }
            else {
                prevNode.setNext(currNode.getNext());

                currNode.setNext(null);
            }
            if (currNode == tail) {
                tail = prevNode;
            }
        }
        length--;

        return currNode;
    }

    public boolean remove(T n) {
        AbstractSinglyLinkedNode<T> node = head;
        AbstractSinglyLinkedNode<T> prevNode = head;
        boolean removed = false;

        if (node == null) {
            return false;
        }

        if (head.getData() == n) {
            head = node.getNext();
            node.setNext(null);
            length--;
            return true;
        }

        while(node != null) {
            if (node.getData() == n) {
                removed = true;
                break; 
            }
            prevNode = node;
            node = node.getNext();
        }

        if (removed == false) {
            return false;
        }

        prevNode.setNext(node.getNext());
        node.setNext(null);
        if (node == tail) {
            tail = prevNode;
        }
        length--;

        return removed;


    }

    public AbstractSinglyLinkedNode<T> set(int index, T n) {

        AbstractSinglyLinkedNode<T> newNode = new SinglyLinkedNode<>();
        newNode.setData(n);

        AbstractSinglyLinkedNode<T> currNode = head;
        AbstractSinglyLinkedNode<T> prevNode = null;
        int i;

        if (index > length-1) {
            System.out.println("Oh noes! SLL doesn't have a position " + index + "!");
            return null;
        }

        for (i = 0; i < index; i++) {
            if (currNode.getNext() == null) {
                break;
            }
            prevNode = currNode;
            currNode = currNode.getNext();
        }

        if (prevNode == null) {
            head = newNode;
            newNode.setNext(currNode.getNext());
            currNode.setNext(null);
        } else {
            newNode.setNext(currNode.getNext());
            prevNode.setNext(newNode);

            currNode.setNext(null);
        }
        return newNode;
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

        intList.remove();
        intList.printList();


        AbstractSinglyLinkedList<Integer> singleNode = new SinglyLinkedList<>();
        singleNode.add(50);
        System.out.println(singleNode.getNode(0));
        System.out.println(singleNode.getNode(2));


        AbstractSinglyLinkedList<Integer> emptyList = new SinglyLinkedList<>();

    }

}
