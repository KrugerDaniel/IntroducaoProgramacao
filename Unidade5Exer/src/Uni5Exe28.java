import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe28 {
    public static void main(String[] args) {
        int voto;
        String continuar = "s";
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int total4 = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o número do voto: ");
            voto = input.nextInt();

            switch (voto) {
                case 1:
                    total1++;
                    break;
                case 2:
                    total2++;
                    break;
                case 3:
                    total3++;
                    break;
                case 4:
                    total4++;
                    break;
            }

            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            continuar = input.next();
        }

        int total = total1 + total2 + total3 + total4;

        System.out.println("Percentual de Nenhum de Nós: " + df.format((double) total1 / total * 100) + "%");
        System.out.println("Percentual de CPM22: " + df.format((double) total2 / total * 100) + "%");
        System.out.println("Percentual de Skank: " + df.format((double) total3 / total * 100) + "%");
        System.out.println("Percentual de Jota Quest: " + df.format((double) total4 / (total) * 100) + "%");

        if (total1 > total2 && total1 > total3 && total1 > total4) {
            System.out.println("Nenhum de Nós ganhou!");
        } else if (total2 > total1 && total2 > total3 && total2 > total4) {
            System.out.println("CPM22 ganhou!");
        } else if (total3 > total2 && total3 > total1 && total3 > total4) {
            System.out.println("Shark ganhou!");
        } else {
            System.out.println("Jota Quest ganhou!");
        }

        input.close();
    }
}
