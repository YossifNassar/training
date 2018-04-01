import java.util.Comparator;

public class GraphsTrees {
    public <T> boolean checkBST(TreeNode<T> root, Comparator<T> comparator) {
        return checkBST(root, null, null, comparator);
    }

    public TreeNode getNext(TreeNode node){
        if(node == null) return null;

        if(node.rightChild != null) {
            TreeNode res = null;
            while(res.leftChild != null) {
                res = res.leftChild;
            }
            return res;
        }

        TreeNode current = node;
        while(current.parent != null && current == current.parent.rightChild) {
            current = current.parent;
        }
        return current == node ? null : current;
    }

    private <T> boolean checkBST(TreeNode<T> root, T max, T min, Comparator<T> comparator) {
        if(root == null) return true;
        if(max!= null && comparator.compare(root.data,max) > 0) return false;
        if(min != null && comparator.compare(root.data,min) < 0) return false;
        return checkBST(root.leftChild, root.data, null, comparator)
                && checkBST(root.rightChild, null, root.data, comparator);
    }
}
