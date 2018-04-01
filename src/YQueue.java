public class YQueue<T> {
    private Node<T> head,tail;

    public YQueue() {
        head = tail = null;
    }

    public void add(T item) {
        Node<T> n = new Node<>(item);

        if(head == null){
            head = n;
            tail = n;
            return;
        }

        tail.setNext(n);
        tail = n;
    }

    public T remove() {
        if(head == null) return null;

        T v = head.getKey();
        head = head.getNext();
        if(head == null){
            tail = null;
        }
        return v;
    }

    public T peek() {
        return head == null? null : head.getKey();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
