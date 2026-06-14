import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import sun.jvm.hotspot.gc.shared.Space;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SpaceLinkedListTest {

    static PrintStream p = System.out;
    //Grocery List Items
    SpaceLinkedList testOne;

    @BeforeEach
    void setUp(){
        testOne = new SpaceLinkedList();
//        testOne.add("chicken");
    }

    @Test
    void add() {
        //Adding an item to the list
        testOne.add("blueberries");
    }

    @Test
    void insertInFront(){
        //Adding item to the top of the list - priority
        testOne.insertInFront("milk");
        testOne.insertInFront("beef");
        testOne.insertInFront("chicken");

        p.println("Completed");
    }

    @Test
    void insertToBack(){
        //Adding item to the top of the list - priority
//        testOne.insertInFront("milk");
//        testOne.insertInFront("beef");
        testOne.insertToBack("honey");

        p.println("Completed");
    }

    @Test
    void delete(){
        testOne.insertInFront("A");
        testOne.insertToBack("B");
        testOne.insertToBack("C");

        testOne.delete("A");

        assertEquals("Not Found", testOne.search("A"));
    }
}