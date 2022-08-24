import java.util.Scanner;

public class Uni6Exe06 {
    public Uni6Exe06() {
        Scanner input = new Scanner(System.in);

        double vetor[] = input(input);

        System.out.print("Digite um número para a comparação: ");
        double numero = input.nextDouble();

        input.close();

        if (verificador(vetor, numero)) {
            System.out.println("Achado!");
        } else {
            System.out.println("Null");
        }
    }

    public double[] input(Scanner input) {
        System.out.print("Digite um valor: ");
        int valor = input.nextInt();

        double vetor[] = new double[valor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = input.nextDouble();
        }

        return vetor;
    }

    public boolean verificador(double[] vetor, double numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        new Uni6Exe06();
    }
}
