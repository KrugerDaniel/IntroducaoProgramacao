import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        int dia, manha, tarde;
        int newFunc = 1;
        int totalManha = 0;
        int totalTarde = 0;
        int maior = 0;
        int diaMaior = 0;
        double totalProdução = 0;
        double valor;
        boolean manhaTarde = false;

        Scanner input = new Scanner(System.in);

        while (newFunc == 1) {
            System.out.print("Digite o dia: ");
            dia = input.nextInt();
            while (dia < 0 || dia > 30) {
                System.out.println("Dia inválido");

                System.out.print("Digite o dia novamente: ");
                dia = input.nextInt();
            }

            System.out.print("Digite a quantidade de peças da manhã: ");
            manha = input.nextInt();
            totalManha += manha;

            System.out.print("Digite a quantidade de peças da tarde: ");
            tarde = input.nextInt();
            totalTarde += tarde;

            if (dia <= 15) {
                if (manha + tarde > 100 && manha > 29 && tarde > 29) {
                    valor = (totalManha + totalTarde) * 0.8d;
                } else {
                    valor = (manha + tarde) * 0.5d;
                }
            } else {
                valor = (manha * 0.4) + (tarde * 0.3d); 
            }

            if (maior < (manha + tarde)) {
                maior = manha + tarde;
                diaMaior = dia;
                if (manha > tarde) {
                    totalProdução = manha;
                    manhaTarde = true;
                } else {
                    totalProdução = tarde;
                    manhaTarde = false;
                }
            }

            System.out.println("R$ "+ valor + " (valor recebido)");
                
            System.out.print("Novo funcionário: (1.sim 2.não)? ");
            newFunc = input.nextInt();
        }

        System.out.println("No dia " + diaMaior + " ocorreu a maior produção");

        if (manhaTarde) {
            System.out.println("O perído que mais foi produzido foi de manhã");
        } else {
            System.out.println("O perído que mais foi produzido foi de tarde");
        }
        System.out.println("Total produzido no perído: " + totalProdução);

        input.close();
    }
}
