package MarketPrepReview;

public class Split {
    public static void main(String[] args) {
        //store message as string message
        String message = "My name is Queen";
        //define what we are going to split the message by, in this case the space
        String[] arrayMessage = message.split(" ");
        //once we split the message it becomes an array, so we use index numbers to identify the word we want
        System.out.println("The value is " + arrayMessage[3]);
    }//end of main
}//end of class
