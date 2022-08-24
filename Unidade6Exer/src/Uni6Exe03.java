import java.util.Scanner;

public class Uni6Exe03 {
    public Uni6Exe03() {
        Scanner input = new Scanner(System.in);

        escrever(ajuste(input(input)));

        input.close();
    }

    public double[] input(Scanner input) {
        double vetor[] = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o número: ");
            vetor[i] = input.nextDouble();
        }

        return vetor;
    }

    public double[] ajuste(double[] vetor) {
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                vetor[i] *= 1.02d;
            } else {
                vetor[i] *= 1.05d;
            }
        }

        return vetor;
    }

    public void escrever(double[] vetor) {
        System.out.println("Valores atualizados");
        for (int i = 0; i < 12; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}
