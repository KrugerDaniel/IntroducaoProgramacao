import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        double valor;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double preco = input.nextDouble();

        while (preco != 0) {
            if (preco > 500) {
                valor = preco - (preco * 0.2d);
            } else {
                valor = preco - (preco * 0.15d);
            }

            total += valor;

            System.out.println("Total a pagar: " + valor);

            System.out.print("Digite o valor da compra: ");
            preco = input.nextDouble();
        }

        System.out.println("Total recebido do dia: " + total);

        input.close();
    }
}
