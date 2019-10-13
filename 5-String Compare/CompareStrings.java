/**
 * Created by DS-1 on 2/2/2016.
 */
import java.util.Scanner;
public class CompareStrings
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first word: ");
        String x = sc.nextLine();
        System.out.print("Please enter the second word: ");
        String y = sc.nextLine();
        if(x.equals(y))
        {
            System.out.print(x + " is the same as " + y + ".");
        }
        else if(x.compareTo(y) < 0)
        {
            System.out.print(x + " is less than " + y + ".");

        }
        else
        {
            System.out.print (x + " is greater than " + y + ".");
        }
    }
}
