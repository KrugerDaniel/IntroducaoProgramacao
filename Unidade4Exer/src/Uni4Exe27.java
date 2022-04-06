import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        int opcao, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o horário de chegada: ");
        int horaChegada = input.nextInt() * 60;
        int minutoChegada = input.nextInt();

        int chegada = horaChegada + minutoChegada;

        System.out.print("Digite o horário de partida: ");
        int horaPartida = input.nextInt() * 60;
        int minutoPartida = input.nextInt();

        int partida = horaPartida + minutoPartida;

        if (partida >= chegada) {
            total = partida - chegada;
        } else {
            total = 1440 + (partida - chegada);
        }

        if (total < 30) {
            opcao = 1;
            total = 60;
        } else if ((int) total / 60 <= 2) {
            opcao = 1;
            if (total % 60 >= 5 && (int) total / 60 == 2) {
                opcao = 2;
                total = total / 60 + 1;
            } else if (total % 60 >= 5) {
                total = total / 60 + 1;
            } else {
                total = total / 60;
            }
        } else if ((int) total / 60 <= 4) {
            opcao = 2;
            if (total % 60 >= 5 && (int) total / 60 == 4) {
                opcao = 3;
                total = total / 60 + 1;
            } else if (total % 60 >= 5) {
                total = total / 60 + 1;
            } else {
                total = total / 60;
            }
        } else {
            opcao = 3;
            if ((int) total % 60 >= 5) {
                total = total / 60 + 1;
            } else {
                total = total / 60;
            }
        }
        
        switch (opcao) {
            case 1:
                System.out.println("Tarifa: R$ " + total * 5);
                break;
            case 2:
                System.out.println("Tarifa: R$ " + total * 7.5d);
                break;
            case 3:
                System.out.println("Tarifa: R$ " + total * 10);
                break;
        }

        input.close();
    }
}
