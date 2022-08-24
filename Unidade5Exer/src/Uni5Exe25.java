import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        int pontoD = 0;
        int pontoE = 0;
        int intervalo = 0;
        boolean vencedor = false;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Digite quem fez o ponto (D ou E): ");
            char ponto = input.next().trim().toUpperCase().charAt(0);

            switch (ponto) {
                case 'D':
                    pontoD += 1;
                    System.out.println(pontoD);
                    break;
                case 'E':
                    pontoE += 1;
                    System.out.println(pontoE);
                    break;
            }

            if (pontoD > 20) {
                if (pontoD - pontoE > 0) {
                    intervalo = pontoD - pontoE;
                    vencedor = true;
                }
            } 
            if (pontoE > 20) {
                if (pontoE - pontoD > 0) {
                    intervalo = pontoE - pontoD;
                    vencedor = false;
                }
            }

            if (intervalo >= 2) {
                break;
            }
        }

        if (vencedor) {
            System.out.println("O jogador D venceu!");
        } else {
            System.out.println("O jogador E venceu!");
        }

        input.close();
    }
}
