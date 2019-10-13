/**
 * Created by DS-1 on 2/9/2016.
 */
import java.util.Scanner;
public class ArrayTwo {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("How many integers are in your list? ");
        int k = sc.nextInt();
        int[] a = new int[k];
        int i = 0;

        for (i = 0; i < k; i++){
            System.out.print("Please enter an integer: ");
            a[i] = sc.nextInt();
        }
        for(i = 0; i < a.length; i++)
        {
             sum = sum + a[i];
        }
        for(i = 0; i < k; i++)
        {
            System.out.printf("%5d\n", a[i]);
        }
        System.out.print("-----\n");
        System.out.printf("%5d\n", sum);

    }
}

