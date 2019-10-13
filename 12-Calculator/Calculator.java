/**
 * Created by DS-1 on 2/9/2016.
 */
import java.util.Scanner;
public class Calculator {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        String z = "";
        int x = 0;
        int y = 0;
        String oper = "";
        System.out.println("Basic Calculator Program");

        do {

            System.out.print("Enter the first integer: ");
            x = sc.nextInt();
            System.out.print("Enter the second integer: ");
            y = sc.nextInt();
            System.out.print("Enter the operator: ");
            oper = sc.next();
            if (y == 0) {
                System.out.println("Error: cannot divide by zero.");
            }
            else if (oper.equals("+")) {
                System.out.println("The result is: " + (x + y));
            } else if (oper.equals("-")) {
                System.out.println("The result is: " + (x - y));
            } else if (oper.equals("*")) {
                System.out.println("The result is: " + (x * y));
            } else if (oper.equals("/")) {
                System.out.println("The result is: " + (x / y));
            }else {
                System.out.println("Invalid operation.");
            }
            System.out.print("Another operation (y/n)? ");
            z = sc.next();



    } while (!z.equals("n"));

    }

    }

