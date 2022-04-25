import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema1014 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");

        Scanner input = new Scanner(System.in);

        int km = input.nextInt();
        double litro = input.nextDouble();

        double kml = km / litro;

        System.out.println(df.format(kml) + " km/l");

        input.close();
    }
}