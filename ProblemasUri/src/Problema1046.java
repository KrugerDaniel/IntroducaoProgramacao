import java.util.Scanner;

public class Problema1046 {
    public static void main(String[] args) {
        int total;

        Scanner input = new Scanner(System.in);

        int inicio = input.nextInt();
        int fim = input.nextInt();

        if (inicio > fim) {
            total = 24 - inicio + fim;
        } else if (inicio == fim) {
            total = 24;
        } else {
            total = fim - inicio;
        }

        System.out.println("O JOGO DUROU " + total + " HORA(S)");

        input.close();
    }
}