import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int tarifa;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o horário de entrada: ");

        int horaEntrada = input.nextInt() * 60;
        int minutoEntrada = input.nextInt();

        System.out.print("Digite o horário de saída: ");

        int horaSaida = input.nextInt() * 60;
        int minutoSaida = input.nextInt();

        int entrada = horaEntrada + minutoEntrada;
        int saida = horaSaida + minutoSaida;

        int horario = saida - entrada;

        if (horario < 30) {
            horario = 60;
        } else if (horario % 60 < 30) {
            horario = horario - (horario % 60);
        } else {
            horario = (horario - horario % 60) + 60;
        }

        if (horario == 60) {
            tarifa = 1;
        } else if (horario == 120 || horario == 180) {
            tarifa = 2;
        } else {
            tarifa = 3;
        }

        switch (tarifa) {
            case 1:
                System.out.println("Valor a ser pago R$ " + 2.50);
                break;
            case 2:
                System.out.println("Valor a ser pago R$ " + (2.50 + ((horario / 60 - 1) * 5)));
                break;
            case 3:
                System.out.println("Valor a ser pago R$ " + (12.50 + (horario / 60 - 3) * 9));
                break;
        }

        input.close();
    }
}
