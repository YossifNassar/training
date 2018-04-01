public class YStack<T> {
    Node<T> top;
    int size;

    public YStack(){
        top = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T pop() {
        if(top == null) return null;
        T v = top.getKey();
        top = top.getNext();
        size--;
        return v;
    }

    public T peek(){
        return top == null ? null : top.getKey();
    }

    public void push(T v) {
        Node n = new Node(v, top);
        size++;
        top = n;
    }
}
