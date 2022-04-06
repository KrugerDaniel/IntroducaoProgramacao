import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1009 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();

        double salarioFinal = salario + (vendas * 0.15);

        System.out.println("TOTAL = R$ " + df.format(salarioFinal));

        input.close();
    }
}
