import java.util.Scanner;

public class Uni6Exe04 {
    public Uni6Exe04() {
        Scanner input = new Scanner(System.in);

        int vetor1[] = criarVetor(input);
        int vetor2[] = criarVetor(input);

        int soma[] = somar(vetor1, vetor2);

        escrever(vetor1, "1");
        escrever(vetor2, "2");
        escrever(soma, "Soma");

        input.close();
    }

    public int[] criarVetor(Scanner input) {
        int vetor[] = new int[3];

        System.out.println("Novo vetor");
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o número: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }

    public int[] somar(int[] vetor1, int[] vetor2) {
        int soma[] = new int[3];

        for (int i = 0; i < 3; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        return soma;
    }

    public void escrever(int[] vetor, String palavra) {
        System.out.println("");
        System.out.println("Vetor " + palavra);
        for (int i = 0; i < 3; i++) {
            System.out.print(vetor[i] + "\t");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
}
