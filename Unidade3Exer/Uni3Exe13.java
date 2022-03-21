import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento: ");
        double comprimento = input.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = input.nextDouble();

        double area = altura * comprimento;

        double preco = area * 9 * 12.5f;

        System.out.println("R$ " + df.format(preco));

        input.close();
    }    
}
