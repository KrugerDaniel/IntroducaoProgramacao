/*
Análise: inteiros

Entrada: DOis valores inteiros

Saída: A multiplicação dos dois valores

*/ 
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor1 = input.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        int valor2 = input.nextInt();

        int multi = valor1 * valor2;

        System.out.println("A valor da multiplicação é " + multi);

        input.close();
    }
}
