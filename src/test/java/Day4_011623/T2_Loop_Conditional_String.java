package Day4_011623;

import java.util.ArrayList;

public class T2_Loop_Conditional_String {
    public static void main(String[] args) {
        //define an array list of fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apples"); //index 0
        fruits.add("Oranges"); //index 1
        fruits.add("Grapes"); //index 2
        fruits.add("Bananas"); //index 3

        //use for loop to iterate through the fruits array list
        for (int i = 0; i < fruits.size(); i++) {
            //only print bananas to the console
            //.equals compares the content of the value
            //== compares the reference to a location of java memory
            //equalsIgnoreCase will ignore the upper / lower case letters
//            if (fruits.get(i) == "Bananas"){
//                System.out.println("Go Bananas");
//            if (fruits.get(i).equalsIgnoreCase("BANANAS")){
//                System.out.println("Go Bananas");
//            }
            if (fruits.get(i).equals("Bananas")) {
                System.out.println("Go Bananas");
            }//end of if clause
        }//end of for loop
    }//end of main
}// end of class
