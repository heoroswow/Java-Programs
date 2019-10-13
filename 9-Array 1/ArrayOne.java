/**
 * Created by DS-1 on 2/9/2016.
 */
import java.util.Scanner;
public class ArrayOne {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = {5,3,12,3,6,14,2,9,8,4};
        System.out.print("Please enter an index: ");
        int userNum = sc.nextInt();
        System.out.print("The element at index " + userNum  + " is " + a[userNum] + ".");

    }
}
