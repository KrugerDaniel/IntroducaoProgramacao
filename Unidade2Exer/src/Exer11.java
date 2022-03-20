import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite A: ");
        float ladoA = input.nextFloat();

        System.out.print("Digite B: ");
        float ladoB = input.nextFloat();

        System.out.print("Digite C: ");
        float ladoC = input.nextFloat();

        // a
        float areaTrianguloA = ladoA * ladoC / 2;
        System.out.format("Área tringângulo: %.2f", areaTrianguloA);
        System.out.println("");

        // b
        float areaCirculo = ladoC * ladoC * 3.14159f;
        System.out.format("Área Circulo: %.2f", areaCirculo);
        System.out.println("");

        // c
        float areaTrapezio = (ladoB + ladoA) * ladoC / 2;
        System.out.format("Área trapézio: %.2f", areaTrapezio);
        System.out.println("");

        // d
        float areaQuadrado = ladoB * ladoB;
        System.out.format("Área quadrado: %.2f", areaQuadrado);
        System.out.println("");

        // e
        float areaRetangulo = ladoA * ladoB;
        System.out.format("Área retângulo: %.2f", areaRetangulo);
        System.out.println("");

        input.close();
    }
}
