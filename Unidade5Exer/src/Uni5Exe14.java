import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe14 {
    public static void main(String[] args) {
        int lucro10 = 0;
        int lucro1020 = 0;
        int lucro20 = 0;
        double compraTotal = 0;
        double vendaTotal = 0;
        double lucro;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome do item: ");
            String nome = input.next();

            System.out.print("Digite o valor de compra: ");
            double compra = input.nextDouble();

            System.out.print("Digite o valor de venda: ");
            double venda = input.nextDouble();

            lucro = (venda - compra) / (compra * 100);

            if (lucro < 0.1d) {
                lucro10++;
            } else if (lucro >= 0.1d && lucro <= 0.2d) {
                lucro1020++;
            } else {
                lucro20++;
            }

            compraTotal += compra;
            vendaTotal += venda;
        }

        lucro = (vendaTotal - compraTotal) / (compraTotal * 100);

        System.out.println("");
        System.out.println("Mercadoria com um lucro menor de 10%: " + lucro10);
        System.out.println("Mercadoria com um lucro entre 10% e 20%: " + lucro1020);
        System.out.println("Mercadoria com um lucro maior de 20%: " + lucro20);
        System.out.println("");
        System.out.println("Valor total de compra: " + df.format(compraTotal));
        System.out.println("Valor total de venda: " + df.format(vendaTotal));
        System.out.println("Valor total de lucro: " + df.format((vendaTotal * lucro)));

        input.close();
    }
}
