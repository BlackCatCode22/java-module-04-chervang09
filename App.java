// cV 9/26/24
// App.java
// Driver file for the zoo midterm program

package cher.zoo.com;



public class App {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my Zoo Program!\n");

        cher.zoo.com.Animal myAnimal = new cher.zoo.com.Animal();
        myAnimal.setAnimalName("my first animal");
        System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());

        cher.zoo.com.Animal anotherAnimal = new cher.zoo.com.Animal("Zig");
        System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());

        System.out.println("\n Number of animals is: " + cher.zoo.com.Animal.numOfAnimals);

        // Create a hyena with a name
        cher.zoo.com.Hyena aNewHyena = new cher.zoo.com.Hyena("Kamari");

        System.out.println("\n The new hyena's name is: " + aNewHyena.getAnimalName());

        System.out.println("\n Number of animals is: " + cher.zoo.com.Animal.numOfAnimals);



    }
}