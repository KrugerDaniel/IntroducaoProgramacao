import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int valor1 = input.nextInt();

        System.out.print("Digite o valor 2: ");
        int valor2 = input.nextInt();

        System.out.print("Digite a opção desejada: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(valor1 - valor2);
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                System.out.println(valor1 / valor2);
                break;
            default:
                System.out.println("Erro!");
        }

        input.close();
    }
}
