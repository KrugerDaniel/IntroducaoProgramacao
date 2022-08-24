import java.util.Scanner;

public class Uni6Exe01 {
    public Uni6Exe01() {
        Scanner input = new Scanner(System.in);

        escrever(input(input));

        input.close();
    }

    public int[] input(Scanner input) {
        int inteiro[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            inteiro[i] = input.nextInt();
        }

        return inteiro;
    }
    
    public void escrever(int[] inteiro) {
        System.out.println("Valores dentro do Vetor");
        for (int i = 0; i < 10; i++) {
            System.out.print(inteiro[i] + " ");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe01();
    }
}
