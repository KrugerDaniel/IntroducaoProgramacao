/* Descreva um programa que calcule o volume de uma lata de óleo. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Digite o raio da lata: ");
        double raio = input.nextDouble();

        System.out.print("Digite a altura da lata: ");
        double altura = input.nextDouble();

        double volume = Math.PI * (raio * raio) * altura;

        System.out.println("O volume da lata é " + df.format(volume));

        input.close();
    }
}
