import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o comprimento do lado1: ");
        double lado1 = input.nextDouble();

        System.out.print("Entre com o comprimento do lado2: ");
        double lado2 = input.nextDouble();

        System.out.print("Entre com o comprimento do lado3: ");
        double lado3 = input.nextDouble();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("é equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("é isóceles");
            } else {
                System.out.println("é escaleno");
            }
        } else {
            System.out.println("não formam um triângulo");
        }

        input.close();
    }
}
