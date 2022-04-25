import java.util.Scanner;

public class Problema1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1 = input.nextInt();
        int valor2 = input.nextInt();

        int resto1 = valor2 % valor1;
        int resto2 = valor1 % valor2;

        if (resto1 == 0 || resto2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        input.close();
    }
}