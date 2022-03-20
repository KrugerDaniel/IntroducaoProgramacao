// Como a professor falou para ignorar o desnecessário, resolvi não receber o 
// número das peças, pois é uma inforação que não utilizarei

import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de peças 1: ");
        int qtdPeca1 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        float valorUniPeca1 = input.nextFloat();

        System.out.print("Digite a quantidade de peça 2: ");
        int qtdPeca2 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        float valorUniPeca2 = input.nextFloat();

        float valorFinal = (qtdPeca1 * valorUniPeca1) + (qtdPeca2 * valorUniPeca2);

        System.out.format("O valor final a ser pago é R$%.2f", valorFinal);

        input.close();

    }
}
