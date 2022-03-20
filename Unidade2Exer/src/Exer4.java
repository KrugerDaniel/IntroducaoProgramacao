/*
Análise: (a soma dos pesos é 11)

Entrada: duas notas

Saída: A média ponderada
*/
import java.util.Scanner;

public class Exer4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota A: ");
        float notaA = input.nextFloat();

        System.out.print("Digite a nota B: ");
        float notaB = input.nextFloat();

        float media = (notaA * 3.5f + notaB * 7.5f) / 11f;

        System.out.println("A média ponderada é " + media);

        input.close();
    }
}