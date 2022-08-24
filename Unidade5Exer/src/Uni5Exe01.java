import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int numero = input.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            } else {
                System.out.println(numero + " é ímpar");
            }
        }

        input.close();
    }
}