import java.util.Scanner;

public class metric
{
    public static void main(String[] args)
    {
        double meters = 0;
        double inches = 0;
        double feet = 0;
        double miles = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);//imports scanne

        System.out.println("Enter a value in meters: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            feet = meters * 3.28;
            miles = meters / 1609.34;
            inches = meters * 39.37;
            System.out.printf(meters + " meters converts to %1.2f in feet \n", feet );
            System.out.printf(meters + " meters converts to %1.8f in miles \n", miles);
            System.out.printf(meters + " meters converts to %1.2f in miles \n", inches);
        }
        else
        {
            System.out.println("You have entered an incorrect value ");
            trash = in.nextLine();
        }

    }
}