import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe as 3 cartas: ");
        int carta1 = input.nextInt();
        int carta2 = input.nextInt();
        int carta3 = input.nextInt();

        int qtCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtCartasBoas += 1;
        } 
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtCartasBoas += 1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtCartasBoas += 1;
        }
        if (qtCartasBoas == 1) {
            System.out.println("TRUCO");
        } else if (qtCartasBoas == 2) {
            System.out.println("SEIS");
        } else if (qtCartasBoas == 3) {
            System.out.println("NOVE");
        }

        input.close();
    }
}
