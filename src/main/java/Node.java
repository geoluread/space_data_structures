import lombok.Getter;
import lombok.Setter;

public class Node {
    @Getter @Setter String data = null;
    @Getter @Setter String next = null;

    public Node(){
    }

    public boolean has_next(){
        if(next!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public void apppend(String next_node){
        next = next_node;
    }
}
