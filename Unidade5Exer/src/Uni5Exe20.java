import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        int tempo = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a massa incial: ");
        double massa = input.nextDouble();

        double massaInicial = massa;

        while (massa > 0.5d) {
            tempo += 50;
            massa /= 2;
        }

        System.out.println("Massa Incial = " + massaInicial + "kg");
        System.out.println("Massa Final = " + massa + "kg");
        System.out.println("Tempo = " + tempo + "s");

        input.close();
    }
}
