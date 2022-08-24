import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = input.next();

        while (!nome.trim().equalsIgnoreCase("FIM")) {
            double nota1 = input.nextDouble();
            double nota2 = input.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("Média = " + media);

            nome = input.next();
        }

        input.close();
    }
}
