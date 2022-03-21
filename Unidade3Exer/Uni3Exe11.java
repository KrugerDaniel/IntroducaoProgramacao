/* Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
°F = (9/5) °C + 32 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em ºC: ");
        double celsius = input.nextDouble();

        double faren = celsius * 9 / 5 + 32;

        System.out.println("" + df.format(faren) + "ºF");

        input.close();
    }
}
