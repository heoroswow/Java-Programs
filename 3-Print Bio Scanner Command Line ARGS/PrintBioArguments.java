/**
 * Created by DS-1 on 1/19/2016.
 */
public class PrintBioArguments {
    public static void main(String[] args)
    {String arg0 = args[0];
        int num = Integer.parseInt(arg0);//Converts a sting to an interger
        String args1 = args[1];

        System.out.print("The 1st argemnt (number): " + num);
        System.out.print("The 2nd arguemnt: " + args1);
    }
}
