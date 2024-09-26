package cher.zoo.com;
import java.util.Date;

public class Animal {
   // Create a static int that keeps track of the number of animas created.
    static int numOfAnimals = 0;

    // Create a constructor for our new animals objects
    public Animal(){
        numOfAnimals++;}

    // Create a constructor that accept a name
    public Animal(String aName) {
        this.animalName = aName;
                numOfAnimals++;
    }


    // Create all attributes (fields) that we need
    // sex will be 'male' or 'female'

    private String sex;
    // age will be in years
    private int age;
    // weight will be in pounds
    private int weight;
    // a unique ID for each animals
    private String animalID;
    // animal names come from the a text file called animalnames.txt
    private String animalName;
    // animal birthdate.
    private Date animalBirthdate;
    // animal color
    private String animalColor;
    // origin zoo
    private String animalOrigin;
    // arrival date
    private Date animalArrivaldate;






    // Create getters and setters

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public String getAnimalID() {return animalID;}
    public void setAnimalID(String animalID) { this.animalID = animalID;}

    public String getAnimalName() {return animalName;}
    public void setAnimalName(String animalName) { this.animalName = animalName;}

    public Date getAnimalBirthdate() {return animalBirthdate;}
    public void setAnimalBirthdate(Date animalBirthdate) { this.animalBirthdate = animalBirthdate;}

    public String getAnimalColor() {return animalColor;}
    public void setAnimalColor(String animalColor) { this.animalColor = animalColor;}

    public String getAnimalOrigin() {return animalOrigin;}
    public void setAnimalOrigin(String animalOrigin) { this.animalOrigin = animalOrigin;}

    public Date getAnimalArrivaldate() {return animalArrivaldate;}
    public void setAnimalArrivaldate(Date animalArrivaldate) {this.animalArrivaldate = animalArrivaldate;}




}

