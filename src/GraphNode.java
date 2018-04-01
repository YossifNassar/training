import java.util.LinkedList;

public class GraphNode<T> {
    private T data;
    private LinkedList<GraphNode<T>> adjacents;

    public GraphNode(T data) {
        this.data = data;
        this.adjacents = new LinkedList<>();
    }

    public GraphNode(T data, LinkedList<GraphNode> adjacents) {
        this.data = data;
        this.adjacents = (LinkedList) adjacents.clone();
    }

    public void connectTo(GraphNode other) {
        this.adjacents.add(other);
    }

    public void detachFrom(GraphNode other) {
        this.adjacents.remove(other);
    }

    public LinkedList<GraphNode<T>> getAdjacents() {
        return this.adjacents;
    }

    public T getData() {
        return data;
    }
}
