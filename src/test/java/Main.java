import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(Main.class);

        logger.info("Program Started -----------------------");

        SpaceDynamicArray testOne = new SpaceDynamicArray();
        testOne.addSensor("GPS");
        System.out.println("Inserting: GPS");
        testOne.printAll();
        System.out.println("\nArray Size: "+testOne.size());

        System.out.println("\n");
        testOne.addSensor("LIDAIR");
        System.out.println("Inserting: LIDAIR");
        testOne.printAll();
        System.out.println("\nArray Size: "+testOne.size());

        System.out.println("\n");
        testOne.addSensor("O2 Scrubber");
        System.out.println("Inserting: O2 Scrubber");
        testOne.printAll();
        System.out.println("\nArray Size: "+testOne.size());

        System.out.println("\nRetrieving Sensor: ");
        System.out.println(testOne.getSensor(6
        ));

        testOne.removeSensor(0);
        System.out.println("\nRemoving Item:");
        testOne.printAll();

        testOne.removeSensor(10);
        System.out.println("\nRemoving Item:");
        testOne.printAll();

//        System.out.println("\n");
//        testOne.addSensor("CO2 Scrubber");
//        System.out.println("Inserting: CO2 Scrubber");
//        testOne.printAll();
//        System.out.println("\nArray Size: "+testOne.size());
//
//        System.out.println("\n");
//        testOne.addSensor("Water");
//        System.out.println("Inserting: Water");
//        testOne.printAll();
//        System.out.println("\nArray Size: "+testOne.size());
//


    }
}
