/**
 * June 6 2026
 * @author geoluread
 * Class the mimics the ArrayList class, but created from scratch to understand the process
 * addSensor(name) — adds a sensor to the active list, resizes the internal array if full
 * removeSensor(index) — decommissions a sensor by index, shifts remaining sensors down
 * getSensor(index) — retrieves a sensor by position
 * printAll() — lists all currently active sensors
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GeoDynamicArray {

    //Instance variables
    private static final int DEFAULT_SIZE = 2;
    private String[] TEMP_ARRAY;
    private int counter = 0;
    private int size = 0;

    //Constructor methods
    public GeoDynamicArray(){
        TEMP_ARRAY = new String[DEFAULT_SIZE];
    }

    //Constructor method w/ size
    public GeoDynamicArray(int userSize){
        if(userSize > 0){
            TEMP_ARRAY = new String[userSize];
            size = userSize;
        }
        else{
            throw new IllegalArgumentException("Illegal Capacity: "+ userSize + ". Size has to be greater than 0.");
        }
    }

    //Constructor method to turn array into an object array
    public GeoDynamicArray(String[] userArray){
        if(userArray.length > 0){
            size = userArray.length;
            TEMP_ARRAY = new String[userArray.length];
            for(int i = 0; i < size; i++){
                TEMP_ARRAY[i] = userArray[i];
            }
        }
        else{
            throw new IllegalArgumentException("Illegal Capacity: Array size is 0 or less than.");
        }
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



    public static void main(String[] args){

        System.out.println("GeoDynamic Array Test\n");
        //GeoDynamicArray checkOne = new GeoDynamicArray(-1);

//        String[] oneArray = {"one", "two", "three"};
//
//        String[] twoArray = oneArray;
//
//        twoArray[0] = "fifth";
//
//        System.out.println("Printing out the original array");
//        for(String x: oneArray){
//            System.out.print(x+" ");
//        }
//
//        System.out.println("\n\nPrinting out the copied array");
//        for(String x: twoArray){
//            System.out.print(x+" ");
//        }
//
//        //---------------------------------------------------
//        String[] thirdArray = oneArray.clone();
//
//        thirdArray[0] = "tenth";
//
//        System.out.println("\n\nPrinting out the cloned array");
//        for(String x: thirdArray){
//            System.out.print(x+" ");
//        }
//
//        System.out.println("\n\nPrinting out the original array");
//        for(String x: oneArray){
//            System.out.print(x+" ");
//        }

        try{
            Scanner temp = new Scanner(System.in);
            System.out.println("Input a Number: ");
            int userInput = temp.nextInt();
        }
        catch(InputMismatchException ex){
            System.out.println(ex);
        }

        System.out.println("OUTSIDE WITH NO ISSUES");

        Scanner temp = new Scanner(System.in);
        System.out.println("Input Second Number: ");
        int userInput2 = temp.nextInt();

    }
}


