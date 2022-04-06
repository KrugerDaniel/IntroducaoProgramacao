import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int inteiro1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int inteiro2 = input.nextInt();

        if (inteiro1 > inteiro2) {
            System.out.println(inteiro1 + " > " + inteiro2);
        } else {
            System.out.println(inteiro1 + " < " + inteiro2);
        }

        input.close();
    }
}
