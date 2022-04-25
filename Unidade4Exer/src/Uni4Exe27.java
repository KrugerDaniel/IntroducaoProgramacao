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

        if ((int) total / 60 < 2) {
            opcao = 1;
        } else if ((int) total / 60 == 2) {
            opcao = 2;
        } else if ((int) total / 60 == 3) {
            opcao = 3;
        } else if ((int) total / 60 == 4) {
            opcao = 4;
        } else {
            opcao = 5;
        }

        if (opcao == 5 && (int) total % 60 >= 5) {
            total = total / 60 + 1;
        } else if (total % 60 >= 5 && !(total / 60 < 1)) {
            opcao += 1;
        } else {
            total = (int) total / 60;
        }

        switch (opcao) {
            case 1:
                System.out.println("Tarifa: R$ 5");
                break;
            case 2:
                System.out.println("Tarifa: R$ 10");
                break;
            case 3:
                System.out.println("Tarifa: R$ 17.50");
                break;
            case 4:
                System.out.println("Tarifa: R$ 25");
                break;
            case 5:
                System.out.println("Tarifa: R$ " + (25 + (total - 4) * 10));
                break;
        }

        input.close();
    }
}
