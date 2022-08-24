import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        int valor;
        int menor = 0;
        int total = 0;
        int qtdPositivo = 0;

        Scanner input = new Scanner(System.in);

        int qtd = input.nextInt();

        for (int i = 0; i < qtd; i++) {
            valor = input.nextInt();

            if (valor < 0) {
                if (valor < menor) {
                    menor = valor;
                } 
            } else {
                total += valor;
                qtdPositivo ++;
            }
        }

        double media = total / qtdPositivo;

        System.out.println("Menor: " + menor);
        System.out.println("Média dos positivos: " + media);

        input.close();
    }
}
