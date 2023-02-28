package Day2_010923;

public class T1_LinearArray {

    public static void main(String[] args) {
        //declare a string array variable
        String[] zipCode;
        //store some zipcode value in the zipCode array
        //indexes are counted starting from 0
        zipCode = new String[]{"11218", "11238", "11255", "11467"};
        //print out the first item from the array
        System.out.println("My first zipcode is " + zipCode[0]);
        //print out the third item from the array
        System.out.println("My third zipcode is " + zipCode[2]);

        //declare int array variable
        //arrays can be declared and initialized on the same line instead of two lines
        int[] studentGrades = new int[]{75, 80, 90, 95, 99, 100};
        //print out the number 100 which is stored at index 5
        System.out.println("Printing out the 6th int value: " + studentGrades[5]);
        //print out the length of the list of scores
        System.out.println("The length of the list is " + studentGrades.length);
    }//end of main
}//end of class
