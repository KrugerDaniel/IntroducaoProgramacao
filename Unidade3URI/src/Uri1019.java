import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int segundos = input.nextInt();

        int horas = segundos / 3600;
        segundos %= 3600;

        int minutos = segundos / 60;
        segundos %= 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        input.close();
    }
}
