/* Uma imobiliária vende apenas terrenos retangulares. 
Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno. */

import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento do terreno: ");
        float comprimento = input.nextFloat();

        System.out.print("Digite a largura do terreno: ");
        float largura = input.nextFloat();

        float area = comprimento * largura;

        System.out.println("A área do terreno é de " + area);

        input.close();

    }
}