package Day4_011623;

public class T4_ReturnMethodExample {
    public static void main(String[] args) {
        //declare a new variable called sumOfTwoNum
        int sumOfTwoNum = ReusableClass.returnSumOfTwoNumbers(9,10); //=19
        //System.out.println("The sum from reusable method is " + sumOfTwoNum);
        //you can take the result and write it separately here
        int thirdNum = 100;
        //add a third number to the result from the reusable return method
        int fourthNum = 51;
        int sumOfThreeNumbers = sumOfTwoNum + thirdNum;
        System.out.println("The sum of three numbers is " + sumOfThreeNumbers);
        //main difference void method only does operations but no value back
        //return result gives us a value back
        int sumOfFourNumbers = sumOfTwoNum + thirdNum + fourthNum;
        System.out.println("The sum of four numbers is " + sumOfFourNumbers);
    }//end of main
}//end of class
