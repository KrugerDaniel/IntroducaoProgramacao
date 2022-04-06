import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1008 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        int nome = input.nextInt();
        int horas = input.nextInt();
        double valor = input.nextDouble();

        System.out.println("NUMBER = " + nome);
        System.out.println("SALARY = U$ " + df.format((valor * horas)));

        input.close();
    }
}
