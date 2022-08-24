import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        int qtdDistPedagio = 0;
        int trechos = 0;
        int qtdMax = 0;
        double pedagio, distancia;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor máximo de pedágio: ");
        double maxPedagio = input.nextDouble();

        while (true) {
            System.out.print("Digite o valor do pedágio: ");
            pedagio = input.nextDouble();

            if (pedagio == -1) {
                break;
            }

            System.out.print("Digite a distância: ");
            distancia = input.nextDouble();

            if (pedagio > maxPedagio) {
                qtdMax++;
            }
            if (distancia > 150 && pedagio < maxPedagio) {
                qtdDistPedagio++;
            }
            trechos++;
        }

        System.out.println(qtdMax + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(trechos + " (quantidade de trechos informados)");
        System.out.println(qtdDistPedagio + " (trechos acima de 150km com valor aceito por ele)");

        input.close();
    }
}
