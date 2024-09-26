package cher.zoo.com;

public class Hyena extends cher.zoo.com.Animal {
    // Create a static int that keeps track of the number of Hyena created.
    static int numOfHyena = 0;

    // Create a constructor.
    public Hyena(String someName){
        super(someName);
        numOfHyena++;


    }


}
