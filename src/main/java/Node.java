import lombok.Getter;
import lombok.Setter;
import java.util.LinkedList;

public class Node {
    @Getter @Setter String data;
    @Getter @Setter Node next;

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
}
