import java.util.*;

public class Graph<T> {
    private List<GraphNode<T>> nodes;
    private Map<T, GraphNode<T>> nodeByValue;

    public Graph() {
        nodes = new LinkedList<>();
        nodeByValue = new HashMap<>();
    }

    public void addVertice(T data) {
        if (nodeByValue.containsKey(data)) {
            return;
        }
        GraphNode<T> node = new GraphNode<>(data);
        nodeByValue.put(data, node);
        nodes.add(node);
    }

    public void addVertices(T... vertices) {
        for (T v : vertices) {
            addVertice(v);
        }
    }

    public void addEdge(T first, T second) {
        GraphNode<T> firstNode = nodeByValue.get(first);
        if (firstNode == null) {
            throw new NoSuchElementException("The graph does not contain such a key: " + first);
        }
        GraphNode<T> secondNode = nodeByValue.get(second);
        if (secondNode == null) {
            throw new NoSuchElementException("The graph does not contain such a key: " + second);
        }

        firstNode.connectTo(secondNode);
    }

    public List<T> topologicalSort() {
        Queue<GraphNode<T>> roots = new LinkedList<>();
        Map<GraphNode<T>, Integer> degrees = prepareDegrees();
        List<T> res = new LinkedList<>();
        degrees.forEach((node, degree) -> {
            if (degree == 0) roots.offer(node);
        });

        while (!roots.isEmpty()) {
            GraphNode<T> node = roots.poll();
            res.add(node.getData());
            node.getAdjacents().forEach(adj -> {
                int degree = degrees.containsKey(adj) ? degrees.get(adj) - 1 : 0;
                if (degree <= 0) {
                    roots.offer(adj);
                }
                degrees.put(adj, degree);
            });
        }

        return res;
    }

    private Map<GraphNode<T>, Integer> prepareDegrees() {
        Map<GraphNode<T>, Integer> degrees = new HashMap<>();
        nodes.forEach(node ->
        {
            degrees.put(node, degrees.containsKey(node) ? degrees.get(node) : 0);
            node.getAdjacents().forEach(adj -> {
                int degree = degrees.containsKey(adj) ? degrees.get(adj) + 1 : 1;
                degrees.put(adj, degree);
            });
        });
        return degrees;
    }
}
