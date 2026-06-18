import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;
import java.util.LinkedList;

public class SpaceLinkedList {

    static PrintStream p = System.out;
    Node head;//Head - null by default
    Node current;
    int counter;
    Logger log = LoggerFactory.getLogger(SpaceDynamicArray.class);

    public SpaceLinkedList(){
        log.info("Space Linked List Created");
        counter = 0;
    }

    public void add(String data){
        log.info("Adding Node");
        Node newNode = new Node(data);
        counter++;

        if(head == null){
            head = newNode;
            return;
        }
    }

    public void insertInFront(String data){

        log.info("Inserting Element to Front");
        Node old_head = head;
        head = new Node(data, old_head);
        counter++;
    }

    public void insertToBack(String data){
        log.info("Inserting Element to Back");
        current = head;
        if(current == null){
            head = new Node(data);
            counter++;
        }
        else{
            while(current.has_next() == true){
                current = current.getNext();
            }
            current.setNext(new Node(data));
            counter++;
        }
    }

    //Can return a null node
    public String search(String target){
        log.info("Searching Linked List");
        current = head;
        if(current == null){
            p.println("List is empty. ["+target+"] does not exist");
            log.info("List is empty. ["+target+"] does not exist");
            return "Not Found";
        }
        else{
            while(current != null){
                if(current.getData() == target){
                    log.info("Target Found. ["+target+"] does exist");
                    return "Found";

                }
                current = current.getNext();
            }
            log.info("List is empty. ["+target+"] does not exist");
            return "Not Found";
        }

    }

    public void delete(String target){
        log.info("Deleteing Element");
        current = head;
        Node previous = null;   //Used to track the previous node in the list

        while(current != null){
            if(current.getData() == target){
                if(previous == null){
                    head = current.getNext(); //This implies that the first node is the one being deleted
                }
                else {
                    previous.setNext(current.getNext());
                }
                counter--;
                log.info("Removing element ["+target+"]. Element has been found in the list");
                return;
            }
            previous = current;
            current = current.getNext();
        }
        log.error("No element with ["+target+"] found in the list");
        return;
    }

    //Need to make it loop
    public Node delete_from_front(String target){
        current = head;
        if(current != null){
            if(current.getData() == target){
                head = current.getNext();
                counter--;
                log.info("Removing element ["+target+"]. Element has been found in the list");
                return head;
            }
        }
        return null;

    }
}
