import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;

public class SpaceDoubleLinkedList {
    Node current;
    Node prev;
    Node head;
    Node tail;
    int counter;
    Logger log = LoggerFactory.getLogger(SpaceDynamicArray.class);
    static PrintStream p = System.out;

    public SpaceDoubleLinkedList(){
        counter = 0;
    }

    public void insertInFront(String target)
    {
        if(head == null){
            tail = head = new Node(target); //Defining the tail and head as the newly inserted node
            counter++;
        }
        else{
            Node old_head = head;
            head = new Node(target);
            head.append(old_head);
            counter++;
        }
    }

    public void insertToBack(String target){
        if(tail == null){
            tail = head = new Node(target); //Defining the tail and head as the newly inserted node
            counter++;
        }
        else{
            Node old_tail = tail;
            tail = new Node(target);
            tail.prepend(old_tail);
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



    public static void main(String[] args){
        SpaceDoubleLinkedList testOne = new SpaceDoubleLinkedList();

        testOne.insertInFront("A");
        testOne.insertInFront("B");
        testOne.insertInFront("C");
        testOne.insertToBack("Z");
        testOne.insertToBack("Y");

        testOne.search("Z");

        System.out.println("Completed");

    }

}

