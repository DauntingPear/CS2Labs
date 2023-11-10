public abstract class AbstractSinglyLinkedNode <T> {
    //these should be protected, but I make them public to test your code
    public T data;
    public AbstractSinglyLinkedNode<T> next;
   
    public abstract T getData();
   
    public abstract void setData(T data);
   
    public abstract AbstractSinglyLinkedNode<T> getNext();
   
    public abstract void setNext(AbstractSinglyLinkedNode<T> next);
   
    @Override
    public final String toString() {
        return String.format("Node(%d)", this.data);
    }
}
