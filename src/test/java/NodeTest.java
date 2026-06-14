import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node node3;

    @BeforeAll
    static void setUp(){
        System.out.println("Initialization");
    }

    @BeforeEach
    void setUpObject(){
        node3 = new Node();
    }

    @Test
    void getData() {
    }

    @Test
    void getNext() {
    }

    @Test
    void setData(){
        node3.setData("blueberries");
        assertEquals("blueberries", node3.getData());
    }

    @Test
    void setNext() {
//        node1.setNext(node2);
//        node2.setNext(node3);
    }

    @Test
    void has_next(){
//        System.out.println(node1.has_next());
//        System.out.println(node2.has_next());
//        System.out.println(node3.has_next());
    }

}