package ActionItem;

import java.util.ArrayList;

public class ActionItem_02_Assignment2 {
    public static void main(String[] args) {
        //declare an arraylist of cities: Brooklyn, Queens, Manhattan, Staten
        ArrayList<String> cities = new ArrayList<>();
        //add values for cities
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten");
        //call for loop to print out all the cities
        for (int i =0; i< cities.size(); i++) {
            System.out.println("The city is " + cities.get(i));
        }//end of for loop
    }//end of main
}//end of class
