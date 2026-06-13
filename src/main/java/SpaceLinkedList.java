import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

public class SpaceLinkedList {

    Node head; //Head
    int counter;

    public SpaceLinkedList(){
        counter = 0;
    }

    public void add(String data){
        Node newNode = new Node(data);
        counter++;

        if(head == null){
            head = newNode;
            return;
        }
    }

    public void traverseList(){

    }

    public void insertInFront(String data){

        Node old_head = head;
        head = new Node(data, old_head);
        counter++;
    }


}
