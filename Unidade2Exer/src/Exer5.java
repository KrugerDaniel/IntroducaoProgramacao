

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int valorA = input.nextInt();

        System.out.print("Digite o valor B: ");
        int valorB = input.nextInt();

        System.out.print("Digite o valor C: ");
        int valorC = input.nextInt();

        System.out.print("Digite o valor D: ");
        int valorD = input.nextInt();

        int diferenca = valorA * valorB - valorC * valorD;

        System.out.println("A diferença é " + diferenca);

        input.close();
    }
}
