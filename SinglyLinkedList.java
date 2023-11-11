public class SinglyLinkedList<T> extends AbstractSinglyLinkedList<T> {

    public SinglyLinkedList() {}

    public AbstractSinglyLinkedNode<T> getNode(int index) {
    }

    public void add(int index, T n) {

    }

    public void add(T n) {

    }

    public void addFirst(T n) {
    }

    public void clear() {
    }

    public AbstractSinglyLinkedNode<T> remove() {
    }

    public AbstractSinglyLinkedNode<T> removeAt(int index) {
    }

    public boolean remove(T n) {
    }

    public AbstractSinglyLinkedNode<T> set(int index, T n) {
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
