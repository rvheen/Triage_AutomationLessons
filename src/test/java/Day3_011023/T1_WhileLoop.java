package Day3_011023;

import java.util.ArrayList;

public class T1_WhileLoop {
    public static void main(String[] args) {
        //declare array list of countries
        ArrayList<String> countries = new ArrayList<>();
        //add values for countries
        countries.add("USA"); //index 0
        countries.add("PAKISTAN"); //index 1
        countries.add("INDIA"); //index 2
        countries.add("BANGLADESH"); //index 3

        //set the initializer first
        int i = 0;

        //define the end point in while command
        while (i < countries.size()){
            //shortcut for print statement is lowercase sout
            System.out.println("country is " + countries.get(i));
            //print out the i value to see the iteration number
            System.out.println("the iteration number is now: " + i);
            //at the end before closing the while loop, call the incrementation
            i=i+1; //i++ //if you don't have incrementation, while loop will become infinite loop
        }//end of while loop
        /*
        everything here blocks off as comments
         */
    }//end of main
}//end of class
