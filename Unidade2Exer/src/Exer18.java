import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento: ");
        float comprimento = input.nextFloat();

        System.out.print("Digite a altura: ");
        float altura = input.nextFloat();

        float area = comprimento * altura;

        float preco = area / 9 * 12.5f;

        System.out.format("O preço necessário será R$%.2f", preco);

        input.close();
    }
}
