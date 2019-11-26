import java.util.Iterator;

public class AvlTree {

    private Node<Integer> root;
    private int size;

    /**
     * Default constructor.
     */
    public AvlTree(){
        this.root = new Node<>();
        this.size = 0;
    }

    public AvlTree(int[] data){

    }

    public AvlTree(AvlTree avlTree){

    }

    /**
    * Add a new node with the given key to the tree.
     * @param newValue the value of the new node to add.
     * @return true if the value to add is not already in the tree and it was successfully added,
     * false otherwise.
    */

    public boolean add(int newValue){
        if (root.getData() == null){
            root.setData(newValue);
            return true;
        }
        Node<Integer> curNode = root;
        while ((curNode.getLeft() != null) && curNode.getRight() != null){
            if (newValue == curNode.getData())
                return false;
            if (newValue > curNode.getData())
                curNode = curNode.getRight();
            else if (newValue < curNode.getData())
                curNode = curNode.getLeft();
        }
        if (newValue == curNode.getData())
            return false;
        if (newValue > curNode.getData())
            return addToRight(curNode, newValue);
        else

    }

 /**   private boolean addToRight(Node<Integer> curNode, int newValue){
        if (curNode.getRight() == null){
            curNode.setRight(new Node<>(newValue));
            return true;
        }
        if (newValue == (int)(curNode.getRight().getData()))
            return false;
        curNode.setLeft(new Node<>(curNode.getData()));
        if (newValue < (int)(curNode.getRight().getData())) {
            curNode.setData(newValue);
            return true;
        }
        curNode.setData((int)(curNode.getRight().getData()));
        curNode.getRight().setData(newValue);
        return true;
    }

    private boolean addToLeft(Node<Integer> curNode, int newValue){

    }
*/
    /**
     *Check whether the tree contains the given input value.
     * @param searchVal the value to search for.
     * @return the depth of the node (0 for the root) with the given value if it was found in
     * the tree, −1 otherwise.
     */
    public int contains(int searchVal){

    }

    /**
     * Removes the node with the given value from the tree, if it exists.
     * @param toDelete the value to remove from the tree.
     * @return true if the given value was found and deleted, false otherwise.
     */

    public int delete(int toDelete){

    }

    /**
     * @return the number of nodes in the tree.
     */
    public int size(){
        return size;
    }

    public Iterator<Integer> iterator(){

    }

}
