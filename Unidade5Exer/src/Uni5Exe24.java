import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        String vontade = "s";
        double peso = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o limite diário: ");
        double limite = input.nextDouble();

        while (vontade.equalsIgnoreCase("s")) {
            System.out.print("Digite o peso do peixe: ");
            peso += input.nextDouble();

            if (peso >= limite) {
                System.out.println("Peso total: " + peso);
                System.out.println("Limite diário excedido");
                break;
            } else {
                System.out.println("Peso total: " + peso);

                System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
                vontade = input.next().trim();
            }
        }

        input.close();
    }
}
