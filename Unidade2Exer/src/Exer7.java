import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = input.nextLine();

        System.out.print("Digite o salário fixo: ");
        float salarioFixo = input.nextFloat();

        System.out.print("Digite o total de vendas: ");
        float totalVendas = input.nextFloat();

        float porcentagem = totalVendas * 15 / 100;

        System.out.format("O vendedor %s terá o salário final de R$%.2f", nomeVendedor, (salarioFixo + porcentagem));

        input.close();
    }
}
