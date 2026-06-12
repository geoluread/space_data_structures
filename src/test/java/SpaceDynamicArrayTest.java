import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import sun.jvm.hotspot.gc.shared.Space;

import static org.junit.jupiter.api.Assertions.*;

class SpaceDynamicArrayTest {

    SpaceDynamicArray testOne = new SpaceDynamicArray();
    String[] testSet = {"GPS", "LIDAR", "CO SCRUBBER", null};

    @Test
    @DisplayName("Array Size")
    void size() {
        System.out.println("\nArray Size: "+testOne.size());
    }

    @Test
    void isEmpty() {
    }

    @Test
    void printAll() {
        testOne.printAll();
    }

    @Test
    @BeforeEach
    void addSensor() {
        testOne.addSensor("GPS");
        testOne.addSensor("LIDAR");
        testOne.addSensor("CO SCRUBBER");

        assertArrayEquals(testSet, testOne.getTempArray());
    }

    @Test
    void removeSensor() {
        //First string is removed from the array
        testOne.removeSensor(0);
        String[] testRemovalOne = {"LIDAR", "CO SCRUBBER", null, null};
        testOne.printAll();
        assertArrayEquals(testRemovalOne, testOne.getTempArray());


        //Index position 10 does not exist. Error must be logged in log file
        testOne.removeSensor(10);
        String[] testRemovalTwo = {"LIDAR", "CO SCRUBBER", null, null};
        testOne.printAll();
        assertArrayEquals(testRemovalTwo, testOne.getTempArray());

    }
}