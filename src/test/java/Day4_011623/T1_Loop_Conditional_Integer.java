package Day4_011623;

import java.util.ArrayList;

public class T1_Loop_Conditional_Integer {
    public static void main(String[] args) {
        //declare integer array list for student grades
        ArrayList<Integer> studentGrades = new ArrayList<>();
        //add some grade to the studentGrades arrayList
        studentGrades.add(96); //index 0
        studentGrades.add(86); //index 1
        studentGrades.add(76); //index 2
        //for loop to iterate through the array list
        for (int i = 0; i < studentGrades.size(); i++) {
            //start conditional statement to see if grade is 86
            //|| is called the OR operator in java (one of the conditions need to be true in order for it to execute)
            //&& is called the AND operator in java (both of the conditions need to be true in order for it to execute)
            if (studentGrades.get(i) == 76 || studentGrades.get(i) == 96) {
                //print only grade 86
                System.out.println("the student grade is " + studentGrades.get(i) + " Grade A or B");
//            } else if (studentGrades.get(i)==96){
                //combine into one line with OR ||
//                System.out.println("the student grade is " + studentGrades.get(i) + " Grade A");
            }//end of if clause
            //by using for loop allows us to make it dynamic, changing place of index value doesn't matter and will still find it
            //print all students grades to the console
//            System.out.println("Students grades are: " + studentGrades.get(i));
            //this one prints all three
            //print out only grade 86 so use if else
        }//end of for loop
    }//end of main
}//end of class
