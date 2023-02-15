import java.util.Scanner;

public class metric
{
    public static void main(String[] args)
    {
        double meters = 0; //declare variable
        double inches = 0; //declare variable
        double feet = 0; //declare variable
        double miles = 0; //declare variable
        String trash = ""; //declare variable

        Scanner in = new Scanner(System.in);//imports scanner

        System.out.println("Enter a value in meters: "); // asks user for input
        if (in.hasNextDouble()) // if statement that checks to see if input is correct
        {
            meters = in.nextDouble(); //sets meters to the input received from the user
            feet = meters * 3.28; //formula to convert meters to feet
            miles = meters / 1609.34; //formula to convert meters to miles
            inches = meters * 39.37; //formula to convert meters to inches
            System.out.printf(meters + " meters converts to %1.2f in feet \n", feet ); //outputs what the conversion is used printf to keep the decimal to two points
            System.out.printf(meters + " meters converts to %1.8f in miles \n", miles); //outputs what the conversion is used printf to keep the decimal to eight points
            System.out.printf(meters + " meters converts to %1.2f in miles \n", inches); //outputs what the conversion is used printf to keep the decimal to two points
        }
        else // if input is not correct the code block below will run
        {
            trash = in.nextLine(); // if a string is entered as an input it will store that value to trash
            System.out.println("You have entered an incorrect value " + trash); // output that lets the user know that the input received was not expected

        }

    }
}