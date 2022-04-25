import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema1043 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (Math.sqrt((b - c) * (b - c)) < a && a < b + c 
        && Math.sqrt((a - c) * (a - c)) < b && b < a + c
        && Math.sqrt((a - c) * (a - c)) < b && b < a + c) {
            System.out.println("Perimetro = " + df.format(a + b + c));
        } else {
            System.out.println("Area = " + df.format((a + b) * c / 2));
        }

        input.close();
    }
}
