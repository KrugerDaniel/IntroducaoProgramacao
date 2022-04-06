import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número: ");
        double numero = input.nextDouble();

        if ((numero % 1) > 0) {
            System.out.println("Possue casas decimais");
        } else {
            System.out.println("Não possue casas decimais");
        }

        input.close();
    }
}
