import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de dobras: ");
        int dobras = input.nextInt();

        System.out.println("O número de quadrados são " + (Math.pow(2, dobras)));

        input.close();
    }
}
