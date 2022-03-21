import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite distância em Km: ");
        double distancia = input.nextDouble();

        System.out.print("Digite o tempo em horas: ");
        double tempo = input.nextDouble();

        double vm = distancia / tempo;

        double gasto = distancia / 12;

        System.out.println("O carro viaja a um velocidade média de " + df.format(vm) + " km/h");
        System.out.println("O gasto com combustível foi de " + df.format(gasto) + " litros");

        input.close();
    }
}
