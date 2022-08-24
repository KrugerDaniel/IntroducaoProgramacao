import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        int qtdHospede = 0;
        boolean continuar = true;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("(1) encerrar a conta de um hóspede;");
            System.out.println("(2) verificar número de contas encerradas;");
            System.out.println("(3) sair.");

            System.out.print("Digite um número: ");
            int numero = input.nextInt();

            switch (numero) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    String nome = input.next();
                    System.out.print("Digite o número de diarias: ");
                    int diarias = input.nextInt();

                    System.out.println("Nome do Hóspede: " + nome);
                    if (diarias < 15) {
                        System.out.println("Total a ser pago: R$ " + (diarias * 7.5));
                    } else if (diarias > 15) {
                        System.out.println("Total a ser pago: R$ " + (diarias * 5));
                    } else {
                        System.out.println("Total a ser pago: R$ " + (diarias * 6.5));
                    }

                    qtdHospede++;
                    break;
                case 2:
                    System.out.println("Número de contas encerradas: " + qtdHospede);
                    break;
                case 3:
                    continuar = false;
            }
        } while (continuar);

        input.close();
    }
}
