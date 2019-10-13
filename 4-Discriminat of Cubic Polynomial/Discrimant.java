/**
 * Created by DS-1 on 2/2/2016.
 */
public class Discrimant {
    public static void main(String [] args) {
        double arg0 = Double.parseDouble(args[0]);
        double arg1 = Double.parseDouble(args[1]);
        double arg2 = Double.parseDouble(args[2]);
        double b = arg0;
        double c = arg1;
        double d = arg2;

        double temp1 = (b*b) * (c*c);
        double temp2 = (4 * (c*c*c));
        double temp3 = (4 * ((b*b*b) *d));
        double temp4 = (27 * (d * d));
        double temp5 = (18 * (b*c*d));
        double poly = (temp1 - temp2 - temp3 -temp4 + temp5 );

        System.out.printf("The discriminant of the polynomial x^3 + %.2fx^2 + %.2fx + %.2f is %.2f",b,c,d, poly);
    }
}


