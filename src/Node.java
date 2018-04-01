public class Node<T> {
    private T key;
    private Node<T> next;

    public Node(T key, Node<T> next) {
        this.key = key;
        this.next = next;
    }

    public Node(T key){
        this(key,null);
    }

    public Node<T> setNext(Node<T> node) {
        next = node;
        return this;
    }

    public Node<T> getNext(){
        return next;
    }

    public T getKey(){
        return key;
    }
}
