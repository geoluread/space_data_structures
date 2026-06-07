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

    //Constructor methods
    public SpaceDynamicArray(){
        TEMP_ARRAY = new String[DEFAULT_SIZE];
    }

    //Append a value to an array
    public void insert(String userValue){
        if(counter == TEMP_ARRAY.length){
            //Extend the array
            String[] oldArray = TEMP_ARRAY.clone();
            TEMP_ARRAY = new String[oldArray.length*2];
            size = TEMP_ARRAY.length;
            counter = oldArray.length-1;    //Set the counter

            for(String arrayValue: oldArray){
                TEMP_ARRAY[counter] = arrayValue;
                counter++;
            }

            //Append the new value
            TEMP_ARRAY[++counter] = userValue;
        }
        else{
            TEMP_ARRAY[counter] = userValue;
            counter++;
        }
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

    public void printAll(){
        String display = "";
        for(String x: TEMP_ARRAY){
            if(x!=null){
                System.out.print(x + ", ");
            }
        }
    }
}
