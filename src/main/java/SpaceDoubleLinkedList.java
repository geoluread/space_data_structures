import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;

public class SpaceDoubleLinkedList {
    Node current;
    Node prev;
    Node next;
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

    public void delete(String target){
        log.info("Removing [" + target + "] from Double Linked List");
        current = head;
        prev = null;
        next = null;

        if(head == null){
            log.error("List is empty. ["+target+"] does not exist");
            p.println("List is empty. ["+target+"] does not exist");
        }
        else{

            //Node is at the front of the list
            if(current.getData() == target){
                head = current.getNext();
                head.prepend(null);
                return;
            }
            //Node is at the end of the list
            else if(tail.getData() == target){
                tail = tail.getPrev();
                tail.append(null);
                return;
            }

            while(current != null){
                if(current.getData() == target){
                    prev = current.getPrev();
                    prev.append(current.getNext());
                    next = current.getNext();
                    next.prepend(current.getPrev());
                    current = null;
                    return;
                }
                else{
                    current = current.getNext();
                }
            }
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

        testOne.delete("Z");
        testOne.delete("Y");
        testOne.delete("C");

        System.out.println("Completed");

    }

}

