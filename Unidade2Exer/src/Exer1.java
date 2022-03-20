/*
Análise: inteiros

Entrada: Dois valores

Saída: A soma

*/ 

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor1 = input.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        int valor2 = input.nextInt();

        int soma = valor1 + valor2;

        System.out.println("O valor da soma é " + soma);

        input.close();
    }
}