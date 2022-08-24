import java.util.Scanner;

public class DanielKruger_1 {
    public static void main(String[] args) {
        int opcao = 0;
        int qtdContas = 0;
        double total;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("___________ Controle de Hópedes ___________");
            System.out.println("1. encerrar a conta de um hóspede");
            System.out.println("2. verificar número de contas encerradas");
            System.out.println("3. sair");

            System.out.print(" __ opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("_ Hóspede _");
                    System.out.print("nome: ");
                    String nome = input.next();
                    System.out.print("diárias: ");
                    int diarias = input.nextInt();

                    if (diarias < 7) {
                        total = 7.3 + (diarias * 10) ;
                    } else if (diarias == 7) {
                        total = 6.3 + (diarias * 10);
                    } else {
                        total = 5.3 + (diarias * 10);
                    }

                    System.out.println(" -----------");
                    System.out.println("Nome: " + nome);
                    System.out.println("Total: " + total);

                    qtdContas++;
                    break;
                case 2:
                    System.out.println(" _ Número de contas encerradas: " + qtdContas);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opção errada!");
            }

            total = 0;
        } while (opcao != 3);

        input.close();
    }
}
