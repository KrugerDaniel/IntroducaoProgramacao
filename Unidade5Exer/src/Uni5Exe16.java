import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        double mediaF = 0;
        double mediaGeral = 0;
        int qtdGeral = 0;
        int qtdF = 0;

        Scanner input = new Scanner(System.in);

        double altura = input.nextDouble();

        while (altura != 0) {
            char sexo = input.next().trim().toLowerCase().charAt(0);

            if (sexo == 'f') {
                mediaF += altura;
                qtdF++;
            }

            mediaGeral += altura;

            qtdGeral++;

            altura = input.nextDouble();
        }

        System.out.println("");
        System.out.println("Média da altura das mulheres: " + ((double) mediaF / qtdF));
        System.out.println("Média da altura geral: " + ((double) mediaGeral / qtdGeral));

        input.close();
    }
}
