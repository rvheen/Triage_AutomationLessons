package Day5_011723;

public class T1_Split {
    public static void main(String[] args) {
        //print the keyword John from the string message
        String message = "My name is John";
//        String message = "MynameisJohn";

        //create an array variable in order to split the single string message
        String[] arrayMessage = message.split(" ");
//        String[] arrayMessage = message.split("My");
//        System.out.println(arrayMessage[1]);
//        String[] arrayMessage2 = arrayMessage[1].split("isJohn");
//        System.out.println("value is " + arrayMessage[0]);
        //print John which is index of 3
        System.out.println("value is " + arrayMessage[3]);
    }//end of main
}//end of class
