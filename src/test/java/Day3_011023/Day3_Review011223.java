package Day3_011023;

import java.util.ArrayList;

public class Day3_Review011223 {
    public static void main(String[] args) {
        //single = sign is used to assign a value to a variable
        int a = 5;
        int b = 8;
        if ((a + a) > b) {
            //even though option 1 and 4 are both true, if the first condition is satisfied, then it doesn't move on
            System.out.println("option 1");
        } else if (b < a) {
            System.out.println("option 2");
        } else if (a == b) {//double equal sign (==) used to compare two values if they are equal to each other or not
            System.out.println("option 3");
        } else if ((b - 1) >= (a + 2)) {
            System.out.println("option 4");
        }//end of conditions; option 4

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Canada");
        //&& means that both condition need to be satisfied in order to proceed
        //both conditions need to be true in order for the full condition to be true
        if (countries.get(0).equals("USA") && countries.get(1).equals("Canada")) {
            System.out.println("Option 1");
            //pipe delimeter (straight bars ||) are used as the OR operator in java
            //only one condition needs to be satisfied in order to proceed
            //can be either or
        } else if (countries.get(0).equals("USA") || countries.get(1).equals("Canada")) {
            System.out.println("Option 2");
            //when using string values use .equals
            //what's difference between == and .equals
            //when comparing content use .equals
            //when comparing integers use ==
        }//end of conditions

        int c = 9;
        int d = 7;
        //can you find the lowest number using conditional statement
        if (c < d) {
            System.out.println("c is the lowest number. c is equal to: " + c);
        } else if (d < c) {
            System.out.println("d is the lowest number. d is equal to: " + d);
        } else if (c == d) {
            System.out.println("c is equal to d");
        }//end of conditions

        //declare an array list of countries
        int[] streetNumber = new int[]{111, 333, 444, 555, 666, 777};
        //iterate through all street number by while loop
        //set the initializer
        int i = 0;
        //now set the condition for while loop
        //linear array gets the count by using .length command
        while (i < streetNumber.length)
        //0 < 6 index
        //1<6
        //2<6
        //true until 5<6
        //fail at 6<6
        {
            //count i
            System.out.println("i is now " + i);
            System.out.println("Street Number: " + streetNumber[i]);
            System.out.println("Length of street number array is: " + streetNumber.length);
            //i++;
            i = i + 1;
        }
    }//end of main
}//end of class
