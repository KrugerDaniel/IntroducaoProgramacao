/* Uma fábrica de refrigerantes vende seu produto em três formatos: 
lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
Se um comerciante compra uma determinada quantidade de cada formato, 
faça um programa para calcular quantos litros de refrigerante ele comprou. */

import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)    ;

        System.out.print("Digite a quantidade de latas: ");
        float lata = input.nextFloat() * 350 / 1000;

        System.out.print("Digite a quantidade de garrafas 600: ");
        float garrafa = input.nextFloat() * 600 / 1000;

        System.out.print("Digite a quantidade de garrafas litrão: ");
        float litro = input.nextFloat() * 2;

        float total = lata + garrafa + litro;

        System.out.println("O total de litros foi de " + total);

        input.close();
    }
}
