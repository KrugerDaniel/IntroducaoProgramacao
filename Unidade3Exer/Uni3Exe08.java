/* Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
Para isto ela entregou um valor em dólares para o atendente. 
Considerando que o atendente tem a cotação do dólar, 
descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa. */

import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor em dólares: ");
        float valor = input.nextFloat() * 4.96f;

        System.out.println("R$ " + valor);

        input.close();
    }
}
