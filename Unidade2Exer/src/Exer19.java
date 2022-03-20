import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de B: ");
        float valorB = input.nextFloat();

        System.out.print("Digite o valor de C: ");
        float valorC = input.nextFloat();

        System.out.print("Digite o valor de D: ");
        float valorD = input.nextFloat();

        valorC = valorD;

        float valorA = valorB;

        System.out.format("O valor de A é %.2f, o valor de B é %.2f, o valor de C é %.2f e o valor de D é %.2f", valorA, valorB, valorC, valorD);

        input.close();
    }
}
