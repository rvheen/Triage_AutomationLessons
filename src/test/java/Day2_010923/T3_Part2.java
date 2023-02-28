package Day2_010923;

import java.util.ArrayList;

public class T3_Part2 {
    public static void main(String[] args) {
        //adding China
        //declare an array list of countries
        ArrayList<String> countries = new ArrayList<>();
        //add values for countries
        countries.add("USA"); // index 0
        countries.add("PAKISTAN"); // index 1
        countries.add("INDIA"); // index 2
        countries.add("BANGLADESH"); // index 3
        countries.add("CHINA"); // index 4
        //call for loop to print out all the countries
        //countries.size() will return 5 but our condition needs to be less than 5 or until 4 so only put <
        //i++ is adding + 1 each time to the iterator(loop)
        for (int i = 0; i < countries.size(); i++) {
            //print out the i value to see the iteration number
            System.out.println("The iteration number is now : " + i);
            //print out all the countries
            System.out.println("The country is " + countries.get(i));
            //this is where the i++ happens
        }//end of for loop
    }//end of main
}//end of class
