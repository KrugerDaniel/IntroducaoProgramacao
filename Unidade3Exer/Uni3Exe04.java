/* Faça um programa para ler três notas de um aluno em uma disciplina e 
imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2). */

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = input.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = input.nextFloat();

        float media = (nota1 * 5 + nota2 * 3 + nota3 * 2)/(5 + 3 + 2);

        System.out.println("A média é " + media);

        input.close();
    }
}
