import lombok.Getter;
import lombok.Setter;
import java.util.LinkedList;

public class Node {
    @Getter @Setter String data;
    @Getter @Setter Node next;
    @Getter @Setter Node prev;

    public Node(){
    }

    public Node(String d){
        data = d;
        next = null;
    }

    public Node(String d, Node nextNode){
        data = d;
        next = nextNode;
    }

    public boolean has_next(){
        if(next!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean has_prev(Node n){
        if(prev!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public void append(Node next_node){
        next = next_node;
        if(next_node != null){
            next_node.setPrev(this);
        }
    }

    public void prepend(Node prev_node){
        prev = prev_node;
        if(prev_node != null){
            prev_node.setNext(this);
        }
    }
}
