import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import sun.jvm.hotspot.gc.shared.Space;

import static org.junit.jupiter.api.Assertions.*;

class SpaceLinkedListTest {

    SpaceLinkedList testOne;

    @BeforeEach
    void setUp(){
        testOne = new SpaceLinkedList();
        testOne.add("chicken");
    }

    @Test
    void add() {
        //Grocery List Items
        testOne.add("blueberries");
    }

    @Test
    void insertInFront(){
        testOne.insertInFront("milk");
    }
}