/**
 * Created by DS-1 on 2/2/2016.
 */
import java.util.Scanner;
public class SwitchCase
{
        public static void main (String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your grade: ");
            int grade = sc.nextInt();
            int quotient = grade / 10;


            switch (quotient) {
                case 6:
                    System.out.print("A grade of " + grade + " is an D.");
                    break;
                case 7:
                    System.out.print("A grade of " + grade + " is an C.");
                    break;
                case 8:
                    System.out.print("A grade of " + grade + " is a B.");
                    break;
                case 9:
                    System.out.print("A grade of " + grade + " is an A.");
                    break;
                case 10:
                    System.out.print("A grade of " + grade +"  is an A.");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                    System.out.print("A grade of " + grade +" is an F.");
                    break;
                case 0:
                    System.out.print("A grade of " + grade +" is an F.");
                    break;
                default:
                    System.out.print("A grade of " + grade + " is not valid.");
                    break;
            }


        }
    }

