import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1010 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        
        Scanner input = new Scanner(System.in);

        int codigo1 = input.nextInt();
        int qtd1 = input.nextInt();
        double preco1 = input.nextDouble();

        int codigo2 = input.nextInt();
        int qtd2 = input.nextInt();
        double preco2 = input.nextDouble();

        double total = qtd1 * preco1 + qtd2 * preco2;

        System.out.println("VALOR A PAGAR: R$ " + df.format(total));

        input.close();
    }
}
