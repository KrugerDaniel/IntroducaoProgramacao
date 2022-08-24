import java.util.Scanner;

public class Uni6Exe09 {
    public Uni6Exe09() {
        int somaMedia = 0;
        int somaHomens = 0;
        int idadeMenor = -1;
        int qtdHomens = 0;
        int notaMenor = 0;
        int notaMulher50[] = new int[30];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 30; i++) {
            int vetor[] = Input(input);

            if (vetor[0] == 1 && idadeMenor == -1) {
                idadeMenor = vetor[2];
                notaMenor = vetor[1];
            } else if (vetor[0] == 1 && vetor[2] > 50) {
                notaMulher50[i] = vetor[1];
            } else if (vetor[0] == 2) {
                somaHomens += vetor[1];
                qtdHomens++;
            }
            somaMedia += vetor[1];
        }

        output(retornoDasMedias(somaHomens, qtdHomens, somaMedia, notaMulher50), notaMenor);

        input.close();
    }

    public void output(double[] vetorMedias, int notaMenor) {
        System.out.println("Média Geral: " + vetorMedias[0]);
        System.out.println("Média dos Homens: " + vetorMedias[1]);
        System.out.println("Nota da Mulher mais jovem: " + notaMenor);
        System.out.println("Média das mulher com mais de 50 anos superior a média geral: " + vetorMedias[2]);
    }

    public double[] retornoDasMedias(int somaHomens, int qtdHomens, int somaMedia, 
    int[] notaMulher50) {
        double mediaHomens = media(somaHomens, qtdHomens);
        double mediaGeral = media(somaMedia, 30);
        double mediaMulher50 = mediaMulher50(notaMulher50, mediaGeral);

        double vetorMedias[] = new double[3];

        vetorMedias[0] = mediaGeral;
        vetorMedias[1] = mediaHomens;
        vetorMedias[2] = mediaMulher50;

        return vetorMedias;
    }

    public double mediaMulher50(int[] notaMulher50, double mediaGeral) {
        int qtdMulher = 0;
        int notaMulher = 0;

        for (int i = 0; i < 30; i++) {
            if (notaMulher50[i] > mediaGeral) {
                notaMulher += notaMulher50[i];
                qtdMulher++;
            }
        }

        return media(notaMulher, qtdMulher);
    }

    public int[] Input(Scanner input) {
        System.out.print("Digite o sexo: ");
        int sexo = input.nextInt();
        System.out.print("Digite a nota: ");
        int nota = input.nextInt();
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();

        int vetor[] = new int[3];

        vetor[0] = sexo;
        vetor[1] = nota;
        vetor[2] = idade;

        return vetor;
    }

    public double media(int soma, int qtd) {
        return ((double) soma / qtd);
    }
    
    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
