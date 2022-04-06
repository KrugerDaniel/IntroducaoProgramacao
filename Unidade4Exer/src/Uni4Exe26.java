import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um triângulo de base b e altura");
        System.out.println("C: calcular a área de um círculo de raio r");

        char opcao = input.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.print("Digite a base e a altura do triângulo: ");
                double base = input.nextDouble();
                double altura = input.nextDouble();
                System.out.println("Área do triângulo = " + base * altura / 2);
                break;
            case 'Q':
                System.out.print("Digite o lado");
                double lado = input.nextDouble();
                System.out.println("Área do quadrado = " + lado * lado);
                break;
            case 'R':
                System.out.print("Digite a base e a altura do retanculo: ");
                double b = input.nextDouble();
                double h = input.nextDouble();
                System.out.println("Área do retângulo = " + b * h);
                break;
            case 'C':
                System.out.print("Digite o raio: ");
                double r = input.nextDouble();
                System.out.println("Área do círculo = " + Math.PI * Math.pow(r, 2));
                break;
            default:
                System.out.println("Opção inválida");
        }

        input.close();
    }
}
