import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1012 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");

        Scanner input = new Scanner(System.in);

        double valorA = input.nextDouble();
        double valorB = input.nextDouble();
        double valorC = input.nextDouble();

        double triangulo = valorA * valorC / 2;
        double circulo = valorC * valorC * 3.14159f;
        double trapezio = (valorA + valorB) * valorC / 2;
        double quadrado = valorB * valorB;
        double retangulo = valorA * valorB;

        System.out.println("TRIANGULO: " + df.format(triangulo));
        System.out.println("CIRCULO: " + df.format(circulo));
        System.out.println("TRAPEZIO: " + df.format(trapezio));
        System.out.println("QUADRADO: " + df.format(quadrado));
        System.out.println("RETANGULO: " + df.format(retangulo));

        input.close();
    }
}
