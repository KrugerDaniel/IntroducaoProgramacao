import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema1038 {
    public static void main(String[] args) {
        double total;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        int codigo = input.nextInt();
        int qtd = input.nextInt();

        if (codigo == 1) {
            total = 4 * qtd;
        } else if (codigo == 2) {
            total = 4.5d * qtd;
        } else if (codigo == 3) {
            total = 5 * qtd;
        } else if (codigo == 4) {
            total = 2 * qtd;
        } else {
            total = 1.5d * qtd;
        }

        System.out.println("Total: R$ " + df.format(total));

        input.close();
    }
}
