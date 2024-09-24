// cV 9/24/24
// ArrayListPractice.java

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to ArrayList Practice!\n");

        // Create an ArrayList of Strings
        ArrayList<String> myListOfStrings = new ArrayList<>();


        // Add a few elements to my ArrayList.
        myListOfStrings.add("first");
        myListOfStrings.add("second");
        myListOfStrings.add("third");

        // Output our ArrayList.
        System.out.println("\n myListOfString is; " + myListOfStrings);

        // Remove an element.
        myListOfStrings.remove(0);

        // Output our ArrayList.
        System.out.println("\n After removing...");
        System.out.println("\n myListOfString is now " + myListOfStrings);

        // Remove an element.
        myListOfStrings.remove("third");

        // Output our ArrayList.
        System.out.println("\n After removing...");
        System.out.println("\n myListOfString is now " + myListOfStrings);

        // Use a for loop to add some things to our ArrayList.
        String toAdd = "";

        for (int i=0; i<10; i++) {
            toAdd = toAdd + " a " + Integer.toString(i);
            myListOfStrings.add(toAdd);
        }

        // Output our ArrayList.
        System.out.println("\n After adding a bunch of stuff...");
        System.out.println("\n myListOfString is now " + myListOfStrings);

        // Use a for loop to output each element of our ArrayList
        for (int i=0; i<myListOfStrings.size(); i++) {
            System.out.println("\n An element in my list is: " + myListOfStrings.get(i));
        }


    }
}