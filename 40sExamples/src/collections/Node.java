package collections;

/**
 *
 * @author d.holmberg
 */
public class Node <T> {
    
    private T data;
    private Node next;
    private Node prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    public Node(T data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
}
