package Day5_011723;

public class Day5_Review011923 {
    public static void main(String[] args) {
        //declare a string variable
        String actionItem = "AI_05";
        //Requirement: As a professor, I would like to see the action item number only
        //tips: use split to achieve this task

        //create an array variable in order to split the single string message
        //declare an array to store the split message
        String [] arrayActionItem = actionItem.split("_");
        //actionItemArr -> add Arr after the initial naming
        //print the action item number 05 which is index of 1
        System.out.println("The action item number is " + arrayActionItem[1]);
        //print out AI text
        System.out.println("The action item text is " + arrayActionItem[0]);
    }//end of main
}//end of class
