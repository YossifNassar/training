import java.util.function.Consumer;

public class YLinkedList<T> {
    private Node<T> head = null;

    public YLinkedList() {

    }

    public YLinkedList(T... keys) {
        Node prev = head;
        for(T key : keys) {
            Node<T> newNode = new Node<>(key);
            if(prev != null) {
                prev.setNext(newNode);
            }
            head = head == null? newNode : head;
            prev = newNode;
        }
    }

    public void forEach(Consumer<T> consumer) {
        Node<T> n = head;
        while(n != null) {
            consumer.accept(n.getKey());
            n = n.getNext();
        }
    }

    public int size() {
        Node<T> n = head;
        int s = 0;
        while(n != null) {
            s++;
            n = n.getNext();
        }
        return s;
    }

    public void reverse(){
        Node prev = null;
        while(head != null) {
            Node next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }
        head = prev;
    }
}
