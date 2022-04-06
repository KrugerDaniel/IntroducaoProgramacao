import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");

        Scanner input = new Scanner(System.in);

        double valor1 = input.nextDouble();
        double valor2 = input.nextDouble();

        double media = (valor1 * 3.5f + valor2 * 7.5f) / 11;

        System.out.println("MEDIA = " + df.format(media));

        input.close();
    }
}
