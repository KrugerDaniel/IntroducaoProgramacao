import java.util.Scanner;

public class DanielKruger_2 {
    public DanielKruger_2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int tamanho = input.nextInt();

        int vetorA[] = lerVetor(input, "VetA", tamanho);
        int vetorB[] = lerVetor(input, "VetB", tamanho);

        int somaVetor[] = somarVetor(vetorA, vetorB, tamanho);

        escreverVetor(ordenarVetor(somaVetor, tamanho));

        input.close();
    }

    public void escreverVetor(int[] vetor) {
        System.out.println("_ valores ordenados.");
        System.out.println(" __ Resultado __");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("VetSoma[" + i + "]: " + vetor[i]);
        }
    }

    public int[] ordenarVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < (vetor.length - 1);) {
            if (vetor[i] > vetor[i+1]) {
                int bolha = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = bolha;

                i = 0;
            } else {
                i++;
            }
        }

        return vetor;
    }

    public int[] somarVetor(int[] vetorA, int[] vetorB, int tamanho) {
        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = vetorA[i] + vetorB[tamanho - (i + 1)];
        }

        return vetor;
    }

    public int[] lerVetor(Scanner input, String nomeVetor, int tamanho) {
        int vetor[] = new int[tamanho];

        System.out.println(" __ Lendo o " + nomeVetor + " __");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Veta[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }

    public static void main(String[] args) {
        new DanielKruger_2();
    }
}
