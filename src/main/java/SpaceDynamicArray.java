import java.util.IllegalFormatException;
//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.Getter;

/**
 * June 6 2026
 * @author geoluread
 * Class the mimics the ArrayList class, but created from scratch to understand the process
 * addSensor(name) — adds a sensor to the active list, resizes the internal array if full -- Done
 * removeSensor(index) — decommissions a sensor by index, shifts remaining sensors down -- Done
 * getSensor(index) — retrieves a sensor by position -- Done
 * printAll() — lists all currently active sensorsn -- Done
 */

public class SpaceDynamicArray {
    //Instance variables
    private static final int DEFAULT_SIZE = 2;
    @Getter private String[] tempArray;
    private int counter = 0;
    private int size = 0;

    //Logging information
    //private static Logger logger = Logger.getLogger("space.log");
    Logger logger = LoggerFactory.getLogger(SpaceDynamicArray.class);

    //Constructor methods
    public SpaceDynamicArray(){
        tempArray = new String[DEFAULT_SIZE];
        logger.info("Dynamic Array Created");
    }

    //Constructor methods
//    public SpaceDynamicArray(String[] presetValues){
//        TEMP_ARRAY = new String[presetValues.length];
//        int i = 0;
//        for(String x: presetValues){
//            TEMP_ARRAY[i] = x;
//            i++;
//        }
//        logger.info("Preset Dynamic Array Created");
//    }

    //Returns integer that is the size of the array
    public int size(){
        return tempArray.length;
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
        for(String x: tempArray){
             if(x == tempArray[0]){
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
            return tempArray[position];
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
        if(counter == tempArray.length){
            //Extend the array
            String[] oldArray = tempArray.clone();
            tempArray = new String[oldArray.length*2];
            size = tempArray.length;
            counter = 0;    //Set the counter

            for(String arrayValue: oldArray){
                tempArray[counter] = arrayValue;
                counter++;
            }

            //Append the new value
            tempArray[counter++] = sensorName;
        }
        else{
            tempArray[counter] = sensorName;
            counter++;
        }
    }

    /**
     * Method to remove a item from the array, given the position is provided by the user
     * @param index
     */
    public void removeSensor(int index){
        if(index>= 0){
            if(index > tempArray.length){
                System.out.println("\n\nInvalid Index Position - Nothing removed from array");
                logger.error("Invalid Index Position");
            }
            else{
                for(int i = index; i < tempArray.length; i++){
                    if(i+1 != tempArray.length){
                        tempArray[i] = tempArray[i+1];
                    }
                    else{
                        tempArray[i] = null;
                    }
                }
            }
        }
    }

    //---------------------------------------   EOF
}
