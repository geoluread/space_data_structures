
public class SpaceDoubleLinkedList {
    Node current;
    Node prev;
    Node head;
    Node tail;
    int counter;

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


    public static void main(String[] args){
        SpaceDoubleLinkedList testOne = new SpaceDoubleLinkedList();

        testOne.insertInFront("A");
        testOne.insertInFront("B");
        testOne.insertInFront("C");
        testOne.insertToBack("Z");
        testOne.insertToBack("Y");

        System.out.println("Completed");

    }

}

