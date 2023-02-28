package ActionItem;

public class ActionItem_02_Assignment3 {
    public static void main(String[] args) {
        //declare string array variable
        String[] cities;
        //defining the variable with values
        cities = new String[]{"Brooklyn", "Queens", "Manhattan", "Staten"};
        //set the initializer first
        int i = 0;
        //define the end point in while command
        while (i < cities.length) {
            System.out.println("The cities are " + cities[i]);
            //declare the incrementation
            i = i + 1;
        }//end of while loop
    }//end of main
}//end of class
