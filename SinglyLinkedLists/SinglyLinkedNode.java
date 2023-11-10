public class SinglyLinkedNode<T> extends AbstractSinglyLinkedNode<T> {

    public SinglyLinkedNode (T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;

    }

    public void setData(T data) {
        this.data = data;
    }

    public AbstractSinglyLinkedNode<T> getNext() {
        return this.next;
    }

    public void setNext(AbstractSinglyLinkedNode<T> next) {
        this.next = next;
    }
}
