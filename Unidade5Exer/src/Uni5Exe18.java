import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe18 {
    public static void main(String[] args) {
        int qtd4 = 0;
        int qtd9 = 0;
        int qtd5 = 0;
        int qtd12 = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do canal: ");
        int canal = input.nextInt();

        while (canal != 0) {
            System.out.print("Digite a quantidade de pessoas que estavam assistindo ao canal: ");
            int qtdPessoas = input.nextInt();

            if (canal == 4) {
                qtd4 += qtdPessoas;
            } else if (canal == 5) {
                qtd5 += qtdPessoas;
            } else if (canal == 9) {
                qtd9 += qtdPessoas;
            } else if (canal == 12) {
                qtd12 += qtdPessoas;
            }

            System.out.print("Digite o nome do canal: ");
            canal = input.nextInt();
        }

        int total = qtd4 + qtd5 + qtd9 + qtd12;

        System.out.println("No canal 4 a audiência estava em " + df.format((double) qtd4 / total * 100) + "%");
        System.out.println("No canal 5 a audiência estava em " + df.format((double) qtd5 / total * 100) + "%");
        System.out.println("No canal 9 a audiência estava em " + df.format((double) qtd9 / total * 100) + "%");
        System.out.println("No canal 12 a audiência estava em " + df.format((double) qtd12 / total * 100) + "%");

        input.close();
    }
}
