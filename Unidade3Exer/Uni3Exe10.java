/* Descreva um programa que leia o comprimento dos catetos de um 
triângulo retângulo e calcule o comprimento da hipotenusa. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;

        DecimalFormat df = new DecimalFormat("#.##");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro cateto: ");
        cateto1 = input.nextDouble();

        System.out.print("Digite o segundo cateto: ");
        cateto2 = input.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("A hipotenusa é " + df.format(hipotenusa));

        input.close();
    }
}
