package nyc.c4q.hyunjookim;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class tools {
    private static String replied;
    public static String jobIsNow;
    public static String children;
    public static String car;

    private static String[] myColorArray = {"blue", "green", "red"};
    private static String[] myNumArray = {"1" ,"2", "3"};
    private static String[] myCarArray = {"a","b","c"};
    static String[] myMash = {"mansion","apartment","shack","house"};

    public static ArrayList<String> spouse = new ArrayList<String>();
    public static String spousesName;
    private static String home;


    public void readInput() {                       // input comes here
        Scanner scanner = new Scanner(System.in);   // reading the input
        String input = scanner.nextLine();          // assign input
        replied = input.toLowerCase();              // reassign input
    }

    public boolean checkColor() {                      // check occupation

        jobIsNow = "";

        if (replied.equalsIgnoreCase("blue")) {
            jobIsNow = " Doctor";
        } else if (replied.equalsIgnoreCase("green")) {
            jobIsNow = " Janitor";
        } else if (replied.equalsIgnoreCase("red")) {
            jobIsNow = " Stripper";
        } else {
            isColor(replied);
        }
        return false;
    }

    public boolean isColor(String replied) {      // check user's input
        for (String temp : myColorArray) {
            if (temp != tools.replied.toLowerCase()) {
                System.out.println("try again");
                readInput();
                checkColor();
            }
            return true;
        }
        return false;
    }


    public boolean checkNumber() {

        children = "";

        if (replied.equalsIgnoreCase("1")) {
            children = " 1 million children ";
        } else if (replied.equalsIgnoreCase("2")) {
            children = " 2 children ";
        } else if (replied.equalsIgnoreCase("3")) {
            children = " 30 children ";
        } else {
            isNumber(replied);
        }
        return false;
    }

    public boolean isNumber(String replied) {      // check user's input

        for (String temp : myNumArray) {
            if (temp != tools.replied.toLowerCase()) {
                System.out.println("Try again");
                readInput();
                checkNumber();
            }
            return true;
        }
        return false;
    }


    public void collectName() {

        if(isRepeated(replied)){
            System.out.println("You already said that, try again!");
            readInput();
            collectName();
        }
        else
            spouse.add(replied);                 // add into the spouses array
    }

    public boolean isRepeated(String replied) {      // check user's input

        for (String temp : spouse) {
            if (replied.equals(temp)){
                return true;
            }
        }
        return false;
    }

    public void chooseName() {
        Random randomizeNames = new Random();   // randomly choose a name
        int pickOne = randomizeNames.nextInt(spouse.size());
        this.spousesName = spouse.get(pickOne);      // picked one spouse name imported
        System.out.println(spouse.get(pickOne));
    }


    public boolean checkLetter() {

        car = "";

        if (replied.equalsIgnoreCase("A")) {
            car = " mini van ";
        } else if (replied.equalsIgnoreCase("B")) {
            car = " hooptie same color as poopy ";
        } else if (replied.equalsIgnoreCase("C")) {
            car = " porsche ";
        } else {
            isCar(replied);
        }
        return false;
    }


    public boolean isCar(String replied) {      // check user's input

        for (String temp : myCarArray) {
            if (temp != tools.replied.toLowerCase()) {
                System.out.println("Try again");
                readInput();
                checkLetter();
            }
            return true;
        }
        return false;
    }

    public void chooseHome() {
        Random randomizeNames = new Random();   // randomly choose a name
        int home = randomizeNames.nextInt(myMash.length-1);
        this.home = myMash[home];      // picked one spouse name imported
        System.out.println(myMash[home]);
    }


} // end of class