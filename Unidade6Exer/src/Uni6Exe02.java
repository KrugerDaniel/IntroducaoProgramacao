import java.util.Scanner;

public class Uni6Exe02 {
    public Uni6Exe02() {
        Scanner input = new Scanner(System.in);

        double vetor[] = input(input);

        escrever(vetor, media(vetor));

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

    public double media(double[] vetor) {
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            soma += vetor[i];
        }

        return (soma / 12);
    }

    public void escrever(double[] vetor, double media) {
        System.out.println("Números maiores que a média");
        for (int i = 0; i < 12; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe02();
    }
}
