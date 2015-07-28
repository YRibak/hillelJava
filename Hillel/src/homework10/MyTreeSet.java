package homework10;


/**
 * Created by yura on 27.07.15.
 */
public class MyTreeSet{
    private Node root;
    public void add(Object data){
        Node newNode = new Node(data);
        add(newNode);
    }
    private void add(Node newNode){
        if (root==null){
            root =newNode;
        } else {
            add(root, newNode);
        }
    }
    private void add(Node addTo, Node newNode) {
        Object addToData = addTo.getData();
        Object newNodeData = newNode.getData();
        int result;
        Comparable addToCompare = (Comparable) addToData;
        Comparable newNodeCompare = (Comparable) newNodeData;
        result = addToCompare.compareTo(newNodeCompare);
        if (result >0){
            if (addTo.getLeft()==null){
                addTo.setLeft(newNode);
            } else {
                add(addTo.getLeft(), newNode);
            }
        } else if(result < 0){
            if (addTo.getRight()==null){
                addTo.setRight(newNode);
            } else {
                add(addTo.getRight(), newNode);
            }
        }
    }

    public Object getMin(){
        return getMin(root);
    }
    public Object getMax(){
        return getMax(root);
    }
    private Object getMin(Node minNode){
        while (minNode.getLeft()!=null){
           minNode = minNode.getLeft();
       }
        return minNode.getData();
    }

    private Object getMax(Node maxNode){
        while (maxNode.getRight()!=null){
           maxNode = maxNode.getRight();
       }
        return maxNode.getData();
    }
    public boolean contains(Object o){
       return contains(o, root)!=null;
    }

    private Node contains(Object o, Node inNode){
        if(inNode==null){
            return null;
        }
        Comparable inNodeCompare = (Comparable) inNode.getData();
        Comparable oCompare = (Comparable) o;
        if (inNodeCompare.compareTo(oCompare) > 0){
            return contains(o, inNode.getLeft());
        } else if (inNodeCompare.compareTo(oCompare) < 0){
            return contains(o, inNode.getRight());
        } else {
            return inNode;
        }
    }

    public Object floor(Object o){
        Node startNode = contains(o, root);
        return startNode.getRight().getData();
    }

    public Object ceiling(Object o){
        Node startNode = contains(o, root);
        return startNode.getLeft().getData();
    }

    public Object maxSubTree(Object o){
        Node subTree = contains(o, root);
        if (subTree==null) {
            return null;
        }
        return getMax(subTree);
    }

    public Object minSubTree(Object o){
        Node subTree = contains(o, root);
        if (subTree==null) {
            return null;
        }
        return getMin(subTree);
    }

    @Override
    public String toString() {
      return null;
    }
}

 class Node {
    private Object data;
    private Node  left;
    private Node right;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

 }
