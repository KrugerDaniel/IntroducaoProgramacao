import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1015 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");

        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(df.format(distancia));

        input.close();
    }
}
