import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de segundos: ");
        int segundos = input.nextInt();

        int horas = segundos / 3600;
        segundos -= horas * 3600;
        int minutos = segundos / 60;
        segundos -= minutos * 60;

        System.out.format("%d:%d:%d", horas, minutos, segundos);
        input.close();
    }
}
