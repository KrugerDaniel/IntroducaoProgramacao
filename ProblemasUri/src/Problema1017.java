import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema1017 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");        

        Scanner input = new Scanner(System.in);

        int horas = input.nextInt();
        int vm = input.nextInt();

        double distancia = vm * horas;

        System.out.println(df.format(distancia / 12));

        input.close();
    }
}