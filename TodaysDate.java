// cv 10/1/24
// TodaysDate.java
//

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TodaysDate {
    public static void main(String[] args) {

        System.out.println("\nWelcome to dates and Animal Class!");

        // Create a Date object to represent the current date
        Date today = new Date();

        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in the String
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        // output the result
        System.out.println("\n Today's date is in the format yyyy-MM-dd: " + strTodaysDate);


        // Calculate birthdates for the following two Hyena
        // 1) 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to calculate birthdates for the animal and then create a method that return a string
        // for the animal's birthdate.

        // input: "4 year old female hyena, born in spring"
        // processing: find the age and birth season
        //             and then use decision control structures to
        //             calculate the date.

        // parse the string
        String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";
        // Split the String on ","
        String[] arrayOfStrPartsOnComma = strStarting.split(", ");
        // output the array elements
        // this is a for : each loop - very handy when examining array elements.
        int elementNum = 0;
        for (String thepart : arrayOfStrPartsOnComma) {
            System.out.println("Element " + elementNum + " of arrayOfStrPartsOnComma is: "+ thepart);
            elementNum++;
        }
        System.out.println();

        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        elementNum = 0;
        for (String thepart : arrayOfStrPartsOnSpace) {
            System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace is: " + thepart);
            elementNum++;

        }
        System.out.println();
        elementNum = 0;
        String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
        for (String thepart : arrayOfStrPartsOnSpace02) {
            System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace02 is: " + thepart);
            elementNum++;
        }

        System.out.println();

        String ageInYears = arrayOfStrPartsOnSpace[0];
        String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
        System.out.println("The age in years of the animal is : " + ageInYears);
        System.out.println("The season of birth of the animal is : " + animalBirthSeason);

        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);


        if (animalBirthSeason.contains("spring")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-03-21";
        }
        if (animalBirthSeason.contains("fall")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
        }
        if (animalBirthSeason.contains("winter")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-12-21";
        }
        if (animalBirthSeason.contains("summer")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-06-21";
        }

        System.out.println("\n animalBirthdate = " + animalBirthdate);


    }
}