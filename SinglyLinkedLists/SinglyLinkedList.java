public class SinglyLinkedList<T> extends AbstractSinglyLinkedList<T> {

    public AbstractSinglyLinkedNode<T> getNode(int index) {
        AbstractSinglyLinkedNode<T> node = new SinglyLinkedNode<>();
        return node;
    }

    public void add(int index, T n) {

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
    }

    public void clear() {
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

        System.out.println(intList.size());

        intList.printList();

    }

}
