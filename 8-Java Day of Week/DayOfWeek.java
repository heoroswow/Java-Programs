/**
 * Created by DS-1 on 2/9/2016.
 */

import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String arg0 = args[0];
        String arg1 = args[1];
        String arg2 = args[2];
        int day = Integer.parseInt(arg0);
        int month = Integer.parseInt(arg1);
        int year = Integer.parseInt(arg2);


        int first_cal = year - (14 - month)/12;
        int cal_one = first_cal + (first_cal/4) - (first_cal/100) + (first_cal/400);
        int cal_two = month + 12 * ((14-month)/12) - 2;
        int cal_three = day + cal_one + (31 * cal_two)/12;
        int cal_four = cal_three % 7;
        System.out.print(day + " " + month + " " + year + " falls on "  + cal_four);


    }
}
