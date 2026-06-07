public class Main {
    public static void main(String[] args){
        SpaceDynamicArray testOne = new SpaceDynamicArray();
        testOne.insert("GPS");
        testOne.printAll();
        System.out.println("\nArray Size: "+testOne.size());

        System.out.println("\n");
        testOne.insert("LIDAIR");
        testOne.printAll();
        System.out.println("\nArray Size: "+testOne.size());

    }
}
