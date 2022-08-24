import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        int totalQuilo = 0;
        double totalCom = 0;
        int novaQuilo;
        int quiloVariado = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de paradas: ");
        int qtdParada = input.nextInt();

        System.out.print("Quilometragem inicial: ");
        int quilometragemInicial = input.nextInt();

        for (int i = 0; i < qtdParada; i++) {
            System.out.print("Digite a quilometragem: ");
            int quilometragem = input.nextInt();

            System.out.print("Digite a quantidade de combustível enchido: ");
            double combustivel = input.nextDouble();

            if (i == 0) {
                novaQuilo = quilometragem - quilometragemInicial;
                quiloVariado = quilometragem;
            } else {
                novaQuilo = quilometragem - quiloVariado;
                quiloVariado = quilometragem;
            }

            double mediaQuilo = novaQuilo / combustivel;

            System.out.println((i + 1) + "ª parada = Média de " + mediaQuilo + " km por litro");

            totalQuilo = quilometragem - quilometragemInicial;
            totalCom += combustivel;
        }

        System.out.println("Média final " + ((double) totalQuilo / totalCom) + " km por litro");

        input.close();
    }
}
