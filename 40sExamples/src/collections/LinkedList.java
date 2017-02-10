package collections;

/**
 *
 * @author d.holmberg
 */
public class LinkedList <T>{
    private Node base;
    private int length;

    public LinkedList(T data) {
        this.base = new Node<>(data);
        this.length = 1;
    }
    
    public boolean add(T data){
        if (data == null) return false;
        if (this.base == null){
            this.base = new Node<>(data);
            return true;
        }
        
        Node node = this.base;
        while(node.getNext() != null){
            node = node.getNext();
        }
        node.setNext(new Node<>(data));
        length++;
        return true;
    }
    
    public boolean add(T data, int pos){
        if (data == null) return false;
        if (this.base == null){
            this.base = new Node<>(data);
            return true;
        }
        
        Node node = this.base;
        for (int i = 0; i < pos; i++) {
            if(node.getNext() == null) return false;
            node = node.getNext();
        }
        node.setNext(new Node<>(data));
        length++;
        return true;
    }
    
    public T read(int pos){
        if (base == null) return null; 
        Node node = base;
        for (int i = 0; i < pos; i++) {
            if(node.getNext() == null) return null;
            node = node.getNext();
        }
        return (T) node.getData();
    }
    
    public boolean remove(int pos){
        
        if (this.base == null) return false;
        
        Node node = this.base;
        for (int i = 0; i < pos-1; i++) {
            if(node.getNext() == null) return false;
            node = node.getNext();
        }
        if(node.getNext() == null) return false;
        node.setNext(node.getNext().getNext());
        length--;
        return true;
    }
    
    
    
    
    
    
    
}
