

import java.util.Scanner;

/*Benjamin Dean
CS1233

 */
public class PrintBio {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name = myScan.next();

        System.out.print("Enter last name: ");
        String lname = myScan.next();

        System.out.print("Enter DOB: ");
        String dob = myScan.next();

        System.out.print("Enter major: ");
        String major = myScan.next();
        System.out.println("------------------------------");
        System.out.println("First name:\t" + name);
        System.out.println("Last name:\t" + lname);
        System.out.println("DOB:\t\t" + dob);
        System.out.println("Major:\t\t" + major);
        System.out.print("------------------------------");
        }


}
