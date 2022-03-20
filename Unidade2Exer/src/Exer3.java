/*
Análise: elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159)

Entrada: O raio

Saída: A área da circunferência
*/ 
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        int valor = input.nextInt();

        float area = valor * valor * 3.1415f;

        System.out.println("O valor da área é " + area);

        input.close();
    }
}
