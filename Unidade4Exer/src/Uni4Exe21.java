import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a massa: ");
        double massa = input.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = input.nextDouble();

        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc < 25) {
            System.out.println("Saudável");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }

        input.close();
    }
}
