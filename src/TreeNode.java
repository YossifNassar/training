public class TreeNode<T> {
    public TreeNode<T> leftChild;
    public TreeNode<T> rightChild;
    public TreeNode<T> parent;
    public T data;

    public TreeNode(T data, TreeNode<T> leftChild, TreeNode<T> rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.data = data;
    }

    public TreeNode(T data) {
        this.leftChild = null;
        this.rightChild = null;
        this.data = data;
    }
}
