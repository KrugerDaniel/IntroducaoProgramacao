/* Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
Escreva um programa que leia o peso do prato montado pelo cliente 
(em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas. */

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        float peso = input.nextFloat();

        float preco = 25 * peso / 1000;

        System.out.println("O total a comprar é de R$ " + preco);

        input.close();
    }
}
