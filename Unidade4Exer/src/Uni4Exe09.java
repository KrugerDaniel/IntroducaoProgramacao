import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numInt1 = input.nextInt();

        System.out.print("DIgite o segundo número inteiro: ");
        int numInt2 = input.nextInt();

        if (numInt1 % numInt2 == 0 || numInt2 % numInt1 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        input.close();
    }
}
