import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        int nota2 = 0;
        int nota5 = 0;
        int nota10 = 0;
        int nota20 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int dinheiro = input.nextInt();

        while (dinheiro > 1) {
            if (dinheiro / 20 > 0) {
                nota20++;
                dinheiro -= 20;
            } else if (dinheiro / 10 > 0) {
                nota10++;
                dinheiro -= 10; 
            } else if (dinheiro / 5 > 0) {
                nota5++;
                dinheiro -= 5; 
            } else if (dinheiro / 2 > 0) {
                nota2++;
                dinheiro -= 2;
            }
        }

        System.out.println("Nota de 20 = " + nota20);
        System.out.println("Nota de 10 = " + nota10);
        System.out.println("Nota de 5 = " + nota5);
        System.out.println("Nota de 2 = " + nota2);
        System.out.println("Nota de 1 = " + dinheiro);

        input.close();
    }
}
