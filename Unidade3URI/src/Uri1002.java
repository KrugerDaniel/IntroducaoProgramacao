import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");

        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.println("A=" + df.format(area));

        input.close();
    }
}
