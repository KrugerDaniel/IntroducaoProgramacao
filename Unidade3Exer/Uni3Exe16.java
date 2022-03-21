import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor a ser pago: ");
        int valor = input.nextInt();

        System.out.print("Digite o quanto foi fornecido: ");
        int fornecido = input.nextInt();

        int troco = fornecido - valor;

        int centena = troco / 100;
        troco %= 100;

        int dezena = troco / 10;
        troco %= 10;

        int unidade = troco;

        System.out.format("%d notas de 100, %d notas de 10 %d, notas de 1", centena, dezena, unidade);

        input.close();
    }
}
