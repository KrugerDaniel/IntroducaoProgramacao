import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        String vontade = "s";

        double precoUnitario = 0;
        int qtd = 0;

        Scanner input = new Scanner(System.in);

        while (vontade.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = input.next();
            
            String vontade2 = "s";
            double comissao = 0;
            double total = 0;

            while (vontade2.equalsIgnoreCase("s")) {
                System.out.print("Digite o preço unitário do produto: ");
                precoUnitario = input.nextDouble();
                System.out.print("Digite a quantidade vendida: ");
                qtd = input.nextInt();

                total += (double) precoUnitario * qtd;

                System.out.print("Deseja digitar os dados de mais um produto: s (SIM) / n (NÃO)? ");
                vontade2  = input.next();
            }
            comissao += total * 0.2d;

            System.out.println("O vendedor " + nome + " vendeu um total de R$" + total + " e ganhou R$" + comissao + " de salário");

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            vontade  = input.next();
        }

        input.close();
    }
}
