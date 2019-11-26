
public class Node<T> {

    private Node right, left, father;
    private T data;
    private int

    public Node(){
        this.data = null;
        this.right = null;
        this.left = null;
        this.father = null;
    }

    public Node(T data){
        this.data = data;
        this.right = null;
        this.left = null;
        this.father = null;
    }

    public void setRight(Node newRight){right = newRight;}

    public void setLeft(Node newLeft){left = newLeft;}

    public void setData(T newData){data = newData;}

    public Node getRight(){return right;}

    public Node getLeft(){return left;}

    public T getData(){return data;}
}
