import java.util.Scanner;

public class Uni6Exe07 {
    public Uni6Exe07() {
        Scanner input = new Scanner(System.in);

        int inteiroN = input(input);

        int[] vetor = adicionarVetor(input, inteiroN);

        output(vetor);

        input.close();
    }

    public void output(int[] vetor) {
        System.out.print("Vetor origem: ");
        System.out.println(mostrarVetor(vetor));

        System.out.print("Vetor ordernado: ");
        System.out.println(mostrarVetor(ordenar(vetor)));
    }

    public int input(Scanner input) {
        int inteiroN;

        do {
            System.out.print("Digite um número inteiro n: ");
            inteiroN = input.nextInt();
        } while (inteiroN > 20);

        return inteiroN;
    }

    public int[] adicionarVetor(Scanner input, int inteiroN) {
        int numero;
        int vetor[] = new int[inteiroN];

        for (int i = 0; i < vetor.length; i++) {
            do {
                System.out.print("Digite um número: ");
                numero = input.nextInt();

            } while (verificador(vetor, numero));

            vetor[i] = numero;
        }

        return vetor;
    }

    public boolean verificador(int[] vetor, int numero) {
        boolean continuar = false;

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == numero) {
                continuar = true;
                break;
            } else {
                continuar = false;
            }
        }

        return continuar;
    }

    public String mostrarVetor(int[] vetor) {
        String frase = "";

        for (int i = 0; i < vetor.length; i++) {
            frase = frase + "[" + vetor[i] + "]";
        }

        return frase;
    }

    public int[] ordenar(int[] vetor) {
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

    public static void main(String[] args) {
        new Uni6Exe07();
    }
}
