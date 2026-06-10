import java.util.IllegalFormatException;
//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * June 6 2026
 * @author geoluread
 * Class the mimics the ArrayList class, but created from scratch to understand the process
 * addSensor(name) — adds a sensor to the active list, resizes the internal array if full
 * removeSensor(index) — decommissions a sensor by index, shifts remaining sensors down
 * getSensor(index) — retrieves a sensor by position
 * printAll() — lists all currently active sensors
 */

public class SpaceDynamicArray {
    //Instance variables
    private static final int DEFAULT_SIZE = 2;
    private String[] TEMP_ARRAY;
    private int counter = 0;
    private int size = 0;

    //Logging information
    //private static Logger logger = Logger.getLogger("space.log");
    Logger logger = LoggerFactory.getLogger(SpaceDynamicArray.class);

    //Constructor methods
    public SpaceDynamicArray(){
        TEMP_ARRAY = new String[DEFAULT_SIZE];
        logger.info("Dynamic Array Created");
    }

    //Returns integer that is the size of the array
    public int size(){
        return TEMP_ARRAY.length;
    }

    //Returns true if the array is empty or equals 0. Returns false if array is not equal to 0.
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else {return false;}
    }

    /**
     * Prints all the sensors that has been added to an array
     */
    public void printAll(){
        String display = "";
        for(String x: TEMP_ARRAY){
             if(x == TEMP_ARRAY[0]){
                 System.out.print(x);
             }
            else if(x!=null){
                System.out.print(", "+x);
            }
        }
    }

    /**
     * Returns the string at a user specified position.
     * @param position
     * @return
     */
    public String getSensor(int position) {
        try{
            return TEMP_ARRAY[position];
        }
        catch(IndexOutOfBoundsException e){
            logger.error("Exception is captured - Index out of Bounds");
            return "FAILURE";

        }
        catch(IllegalFormatException e){
            logger.error("Exception is captured - Improper value utilized");
            return "FAILURE";
        }
    }

    /**
     * Append a new sensor to the list
     * @param sensorName
     */
    public void addSensor(String sensorName){
        if(counter == TEMP_ARRAY.length){
            //Extend the array
            String[] oldArray = TEMP_ARRAY.clone();
            TEMP_ARRAY = new String[oldArray.length*2];
            size = TEMP_ARRAY.length;
            counter = 0;    //Set the counter

            for(String arrayValue: oldArray){
                TEMP_ARRAY[counter] = arrayValue;
                counter++;
            }

            //Append the new value
            TEMP_ARRAY[counter++] = sensorName;
        }
        else{
            TEMP_ARRAY[counter] = sensorName;
            counter++;
        }
    }

    public void removeSensor(int index){

    }

    //---------------------------------------   EOF
}
